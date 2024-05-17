package observer;

public interface Observer {
    void update();
}


// The Observer interface defines the update method that observers must implement to receive notifications of changes in the subject's state.

// Key Points:

// Updating interface: Method to be called when the subject's state changes.

// update(): Method to be implemented by concrete observers to handle updates.


// In Bangla:

// Observer ইন্টারফেসটি update মেথড ডিফাইন করে যা অবজারভাররা ইমপ্লিমেন্ট করে সাবজেক্টের স্টেট পরিবর্তনের উপর ভিত্তি করে নোটিফিকেশন পেতে।

// Key Points:

// আপডেটিং ইন্টারফেস: মেথড যা সাবজেক্টের স্টেট পরিবর্তিত হলে কল হয়।

// update(): অবজারভারদের দ্বারা ইমপ্লিমেন্ট করা মেথড যা আপডেট হ্যান্ডেল করে।