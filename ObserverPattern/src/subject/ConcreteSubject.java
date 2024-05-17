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

// The ConcreteSubject class implements the Subject interface and maintains a state that it shares with observers. When the state changes, it notifies all its observers.

// Key Points:

// Stores state of interest: Holds the state that is relevant to observers.
// Notifies observers when state changes: Calls notifyObservers whenever the state is updated.


// state: The state variable of interest to observers.
// setState(int state): Updates the state and notifies observers.
// List<Observer> observers: Maintains a list of observers.
// notifyObservers(): Notifies each observer by calling its update method.



// In Bangla:

// ConcreteSubject ক্লাসটি Subject ইন্টারফেসটি ইমপ্লিমেন্ট করে এবং একটি স্টেট মেইনটেইন করে যা অবজারভারদের সাথে শেয়ার করে। যখন স্টেট পরিবর্তিত হয়, তখন এটি সকল অবজারভারকে নোটিফাই করে।

// Key Points:

// স্টেট মেইনটেইন করে: অবজারভারদের জন্য প্রয়োজনীয় স্টেট রাখে।
// স্টেট পরিবর্তিত হলে নোটিফাই করে: notifyObservers মেথড কল করে সকল অবজারভারকে নোটিফাই করে।

// state: অবজারভারদের জন্য প্রয়োজনীয় স্টেট।
// setState(int state): স্টেট আপডেট করে এবং অবজারভারদের নোটিফাই করে।
// List<Observer> observers: অবজারভারদের লিস্ট মেইনটেইন করে।
// notifyObservers(): প্রত্যেক অবজারভারকে update মেথড কল করে নোটিফাই করে।