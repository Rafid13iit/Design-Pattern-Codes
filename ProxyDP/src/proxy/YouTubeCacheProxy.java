package proxy;

import java.util.HashMap;

import some_cool_media_library.ThirdPartyYouTubeClass;
import some_cool_media_library.ThirdPartyYouTubeLib;
import some_cool_media_library.Video;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}

// This class implements the same interface and acts as a proxy to the real subject. It adds additional functionality, such as caching.

// YouTubeCacheProxy(): Initializes the real subject.
// popularVideos(): Checks the cache first before calling the real subject's method. If the cache is empty, it fetches the data from the real subject and stores it in the cache.
// getVideo(String videoId): Similar to popularVideos(), but it caches individual videos.
// reset(): Clears the cache.


// In Bangla:

// এই ক্লাসটি একই ThirdPartyYouTubeLib ইন্টারফেস ইমপ্লিমেন্ট করে এবং প্রকৃত সাবজেক্টের প্রক্সি হিসাবে কাজ করে। এটি অতিরিক্ত ফাংশনালিটি যোগ করে, যেমন ক্যাশিং।

// YouTubeCacheProxy(): প্রকৃত সাবজেক্ট ইনিশিয়ালাইজ করে।
// popularVideos(): প্রথমে ক্যাশ চেক করে, যদি ক্যাশ খালি থাকে তাহলে প্রকৃত সাবজেক্টের মেথড কল করে এবং ক্যাশে সংরক্ষণ করে।
// getVideo(String videoId): জনপ্রিয় ভিডিওর ক্ষেত্রে একই ভাবে কাজ করে, তবে এটি একক ভিডিও ক্যাশ করে।
// reset(): ক্যাশ পরিষ্কার করে।