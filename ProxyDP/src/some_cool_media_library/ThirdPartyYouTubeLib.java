package some_cool_media_library;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}


// This interface defines the methods that need to be implemented by the actual service and the proxy.

// popularVideos(): Fetches a list of popular videos.
// getVideo(String videoId): Fetches a specific video by its ID


// In Bangla:

// এই ইন্টারফেসটি সেই মেথডগুলো ডিফাইন করে যা বাস্তব সার্ভিস এবং প্রক্সি দ্বারা ইমপ্লিমেন্ট করা হয়।

// popularVideos(): জনপ্রিয় ভিডিওগুলির একটি লিস্ট ফেরত দেয়।
// getVideo(String videoId): নির্দিষ্ট একটি ভিডিও ফেরত দেয়।