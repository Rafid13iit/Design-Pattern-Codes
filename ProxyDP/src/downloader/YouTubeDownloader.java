package downloader;

import java.util.HashMap;

import some_cool_media_library.ThirdPartyYouTubeLib;
import some_cool_media_library.Video;

public class YouTubeDownloader {
    private ThirdPartyYouTubeLib api;

    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}

// This class uses the ThirdPartyYouTubeLib interface to perform operations without knowing whether it is dealing with the real subject or the proxy.

// YouTubeDownloader(ThirdPartyYouTubeLib api): Constructor that accepts an implementation of ThirdPartyYouTubeLib.
// renderVideoPage(String videoId): Renders a video page using the getVideo method.
// renderPopularVideos(): Renders a list of popular videos using the popularVideos method.



// In Bangla:

// এই ক্লাসটি ThirdPartyYouTubeLib ইন্টারফেস ব্যবহার করে অপারেশন সম্পন্ন করে, এটি জানে না এটি প্রকৃত সাবজেক্ট নাকি প্রক্সি ব্যবহার করছে।

// YouTubeDownloader(ThirdPartyYouTubeLib api): কন্সট্রাক্টর যা ThirdPartyYouTubeLib এর একটি ইমপ্লিমেন্টেশন গ্রহণ করে।
// renderVideoPage(String videoId): একটি ভিডিও পেজ রেন্ডার করে getVideo মেথড ব্যবহার করে।
// renderPopularVideos(): জনপ্রিয় ভিডিওগুলির একটি লিস্ট রেন্ডার করে popularVideos মেথড ব্যবহার করে।