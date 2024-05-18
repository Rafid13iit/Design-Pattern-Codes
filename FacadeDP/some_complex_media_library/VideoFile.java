package some_complex_media_library;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
}


// This class represents a video file. It contains the name and 
// codec type of the video file.

// VideoFile(String name): This constructor takes a name parameter, sets the 
// file name, and determines the codec type from the file extension.

// getCodecType: This method returns the codec type of the video file.

// getName: This method returns the name of the video file.


// In Bangla:

// এই ক্লাসটি একটি ভিডিও ফাইল রিপ্রেজেন্ট করে। এতে ভিডিও ফাইলের নাম এবং কোডেক টাইপ সংরক্ষিত থাকে।

// VideoFile(String name): কন্সট্রাক্টর যা ভিডিও ফাইলের নাম গ্রহণ করে এবং কোডেক টাইপ সেট করে।
// getCodecType: এই মেথডটি ভিডিও ফাইলের কোডেক টাইপ রিটার্ন করে।
// getName: এই মেথডটি ভিডিও ফাইলের নাম রিটার্ন করে।