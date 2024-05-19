package remote;

public interface Remote {
    void power();
    void volumeDown();
    void volumeUp();
    void channelDown();
    void channelUp();
}

/*
 * Remote: This interface defines the basic operations  (power, volume up/down, channel up/down)
 * that all remotes must implement. 
 * It represents the Abstraction in the Bridge pattern.
 *
 * Remote: এই ইন্টারফেসটি মৌলিক অপারেশনগুলি (power, volume up/down, channel up/down) 
 * নির্ধারণ করে যা সমস্ত রিমোটগুলির বাস্তবায়ন করা প্রয়োজন। 
 * এটি ব্রিজ প্যাটার্নের অবস্ট্রাকশন হিসাবে কাজ করে।
 */
