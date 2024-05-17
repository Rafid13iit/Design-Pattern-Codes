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



// The ConcreteObserver class implements the Observer interface. It maintains a reference to the subject it observes and updates its state to stay consistent with the subject.

// Key Points:

// Maintains reference to ConcreteSubject: Keeps a reference to the subject to fetch its state.
// Stores state consistent with the subject: Holds a state variable that mirrors the subject's state.
// Implements update method: Updates its state when notified by the subject.

// ConcreteSubject subject: Reference to the subject being observed.
// observerState: State variable that is updated to match the subject's state.
// ConcreteObserver(ConcreteSubject subject): Constructor attaches the observer to the subject.
// update(): Retrieves the subject's state and updates observerState, printing the new state.



// In Bangla:

// ConcreteObserver ক্লাসটি Observer ইন্টারফেসটি ইমপ্লিমেন্ট করে। এটি সাবজেক্টকে রেফারেন্স করে এবং তার স্টেট আপডেট করে সাবজেক্টের স্টেটের সাথে সামঞ্জস্য রাখে।

// Key Points:

// সাবজেক্টকে রেফারেন্স করে: সাবজেক্টকে রেফারেন্স রাখে।
// সাবজেক্টের সাথে সামঞ্জস্যপূর্ণ স্টেট রাখে: তার নিজস্ব স্টেটকে সাবজেক্টের স্টেটের সাথে আপডেট রাখে।
// আপডেট মেথড ইমপ্লিমেন্ট করে: নোটিফাই হলে তার স্টেট আপডেট করে।

// ConcreteSubject subject: সাবজেক্টের রেফারেন্স।
// observerState: অবজারভারদের স্টেট যা সাবজেক্টের স্টেটের সাথে সামঞ্জস্যপূর্ণ থাকে।
// ConcreteObserver(ConcreteSubject subject): কনস্ট্রাক্টর যা অবজারভারকে সাবজেক্টের সাথে অ্যাটাচ করে।
// update(): সাবজেক্টের স্টেট পেয়ে observerState আপডেট করে এবং প্রিন্ট করে।