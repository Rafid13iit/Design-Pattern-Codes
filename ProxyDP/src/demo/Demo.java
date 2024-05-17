package demo;

import downloader.YouTubeDownloader;
import proxy.YouTubeCacheProxy;
import some_cool_media_library.ThirdPartyYouTubeClass;

public class Demo {

    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}

// This class demonstrates how the proxy pattern works by comparing the performance of the proxy and the real subject.

// main(String[] args): Creates instances of YouTubeDownloader with the real subject and the proxy. It tests both and prints the time saved by using the proxy.
// test(YouTubeDownloader downloader): Simulates user behavior and measures the time taken to perform operations.


// In Bangla:

// এই ক্লাসটি প্রক্সি প্যাটার্ন কিভাবে কাজ করে তা প্রদর্শন করে প্রক্সি এবং প্রকৃত সাবজেক্টের পারফরমেন্স তুলনা করে।

// main(String[] args): প্রকৃত সাবজেক্ট এবং প্রক্সি সহ YouTubeDownloader এর ইনস্ট্যান্স তৈরি করে। এটি উভয়ের পরীক্ষা করে এবং প্রক্সি ব্যবহার করে সময় সেভ করে।
// test(YouTubeDownloader downloader): ইউজারের আচরণ সিমুলেট করে এবং অপারেশন সম্পন্ন করতে সময় পরিমাপ করে।