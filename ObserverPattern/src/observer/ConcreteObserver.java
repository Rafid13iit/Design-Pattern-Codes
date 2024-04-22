package observer;

import subject.ConcreteSubject;

public class ConcreteObserver implements Observer {
    private int observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        observerState = subject.getState();
        System.out.println("Observer state updated: " + observerState);
    }
}
