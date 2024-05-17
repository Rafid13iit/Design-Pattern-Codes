package client;
import java.security.Key;

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

        subject.detach(observer2);

        subject.setState(20);
    }
}



// The Main class demonstrates the creation of a subject and multiple observers, and how state changes in the subject are propagated to the observers.

// Key Points:

// Create Subject and Observers: Initializes a subject and attaches observers.
// Change State and Notify: Changes the subject's state, triggering notifications to observers.

// ConcreteSubject subject = new ConcreteSubject(): Creates an instance of ConcreteSubject.
// ConcreteObserver observer1 = new ConcreteObserver(subject): Creates and attaches an observer.
// subject.setState(10): Sets the state of the subject, notifying all attached observers.
// subject.detach(observer1): Detaches observer1 from the subject.
// subject.setState(20): Changes the state again, notifying the remaining observers.


// In Bangla:

// Main ক্লাসটি একটি সাবজেক্ট এবং একাধিক অবজারভার তৈরি করার এবং কিভাবে সাবজেক্টের স্টেট পরিবর্তন হলে অবজারভাররা আপডেট হয় তা প্রদর্শন করে।

// Key Points:

// সাবজেক্ট এবং অবজারভার তৈরি করা: একটি সাবজেক্ট তৈরি করে এবং অবজারভারদের অ্যাটাচ করে।
// স্টেট পরিবর্তন এবং নোটিফাই করা: সাবজেক্টের স্টেট পরিবর্তন করে এবং অবজারভারদের নোটিফাই করে।

// ConcreteSubject subject = new ConcreteSubject(): একটি ConcreteSubject ইনস্ট্যান্স তৈরি করে।
// ConcreteObserver observer1 = new ConcreteObserver(subject): একটি অবজারভার তৈরি করে এবং সাবজেক্টের সাথে অ্যাটাচ করে।
// subject.setState(10): সাবজেক্টের স্টেট সেট করে এবং সকল অ্যাটাচড অবজারভারকে নোটিফাই করে।
// subject.detach(observer1): observer1 কে সাবজেক্ট থেকে ডিটাচ করে।
// subject.setState(20): আবার স্টেট পরিবর্তন করে এবং বাকি অবজারভারদের নোটিফাই করে।