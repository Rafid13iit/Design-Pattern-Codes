package client;

import device.Device;
import device.Radio;
import device.TV;
import remote.AdvancedRemote;
import remote.BasicRemote;

public class Client {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}

/*
 * Client: This class contains the main method where the application is executed. It demonstrates 
 * how different devices (TV, Radio) can be controlled using both basic and advanced remotes.
 *
 * Client: এই ক্লাসটি প্রধান মেথড ধারণ করে যেখানে অ্যাপ্লিকেশনটি কার্যকর হয়। এটি দেখায় কিভাবে 
 * বিভিন্ন ডিভাইস (টিভি, রেডিও) মৌলিক এবং উন্নত রিমোট ব্যবহার করে নিয়ন্ত্রণ করা যায়।
 */
