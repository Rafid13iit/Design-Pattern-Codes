package remote;

import device.Device;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");
        device.setChannel(device.getChannel() + 1);
    }
}

/*
 * BasicRemote: This class implements the basic operations defined in the Remote interface and 
 * interacts with the Device interface to perform these operations.
 *
 * BasicRemote: এই ক্লাসটি Remote ইন্টারফেসে নির্ধারিত মৌলিক অপারেশনগুলি বাস্তবায়ন করে এবং 
 * এই অপারেশনগুলি সম্পাদনের জন্য Device ইন্টারফেসের সাথে ইন্টারঅ্যাক্ট করে।
 */
