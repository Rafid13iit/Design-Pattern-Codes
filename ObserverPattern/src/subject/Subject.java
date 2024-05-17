package subject;

import observer.Observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
    int getState();
}


// The Subject interface outlines the methods required to manage observers and notify them of changes.

// Key Points:

// Knows its observers: The subject maintains a list of observers.
// Interface for attaching and detaching observers: Provides methods to attach and detach observers.

// attach(Observer observer): Adds an observer to the list.
// detach(Observer observer): Removes an observer from the list.
// notifyObservers(): Notifies all attached observers of a state change.
// getState(): Method to get the current state, which observers may query.




//In Bangla:

// Subject ইন্টারফেসটি অবজারভারদের ম্যানেজ এবং নোটিফাই করার জন্য প্রয়োজনীয় মেথডগুলো ডিফাইন করে।

// Key Points:

// অবজারভারদের চেনে: সাবজেক্ট অবজেক্ট অবজারভারদের একটি লিস্ট রাখে।
// অ্যাটাচ এবং ডিটাচ করার ইন্টারফেস: অবজারভারদের অ্যাটাচ এবং ডিটাচ করার মেথড দেয়।

// attach(Observer observer): অবজারভারকে লিস্টে যোগ করে।
// detach(Observer observer): অবজারভারকে লিস্ট থেকে সরিয়ে দেয়।
// notifyObservers(): সকল অবজারভারদের নোটিফাই করে।
// getState(): সাবজেক্টের বর্তমান স্টেট রিটার্ন করে।


