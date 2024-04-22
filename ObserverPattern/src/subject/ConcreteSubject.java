package subject;


import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class ConcreteSubject implements Subject {
    private int state;
    private List<Observer> observers = new ArrayList<>();

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public int getState() {
        return state;
    }
}
