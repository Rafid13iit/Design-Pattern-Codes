package remote;

import device.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}

/*
 * AdvancedRemote: This class extends BasicRemote and adds an additional mute function. It shows 
 * how new features can be added to remotes.
 *
 * AdvancedRemote: এই ক্লাসটি BasicRemote কে প্রসারিত করে এবং অতিরিক্ত mute ফাংশন যোগ করে। 
 * এটি দেখায় কিভাবে নতুন বৈশিষ্ট্যগুলি রিমোটে যোগ করা যায়।
 */
