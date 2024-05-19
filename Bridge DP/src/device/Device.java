package device;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percent);
    int getChannel();
    void setChannel(int channel);
    void printStatus();
}

/*
 * Device: This interface defines the operations that all concrete devices 
 * must implement (enable, disable, set volume, set channel). It 
 * represents the Implementation in the Bridge pattern.
 *
 * Device: এই ইন্টারফেসটি অপারেশনগুলি নির্ধারণ করে যা সমস্ত কংক্রিট ডিভাইসগুলির বাস্তবায়ন 
 * করা প্রয়োজন (enable, disable, set volume, set channel)। 
 * এটি ব্রিজ প্যাটার্নের ইমপ্লিমেন্টেশন হিসাবে কাজ করে।
 */
