package client;
import observer.ConcreteObserver;
import subject.ConcreteSubject;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);

        subject.setState(10);

        subject.detach(observer1);

        subject.setState(20);
    }
}