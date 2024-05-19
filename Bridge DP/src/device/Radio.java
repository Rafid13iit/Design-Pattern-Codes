package device;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm radio.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}

/*
 * Radio: This class implements the Device interface for a radio. It includes methods to control the 
 * radio's power, volume, and channel.
 *
 * Radio: এই ক্লাসটি রেডিওর জন্য Device ইন্টারফেসটি বাস্তবায়ন করে। এটি রেডিওর পাওয়ার, ভলিউম 
 * এবং চ্যানেল নিয়ন্ত্রণের জন্য মেথড অন্তর্ভুক্ত করে।
 */
