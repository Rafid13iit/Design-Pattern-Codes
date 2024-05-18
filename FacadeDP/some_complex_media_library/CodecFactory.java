package some_complex_media_library;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}

// This class is responsible for extracting the appropriate codec for a given 
// video file. It provides a static method for determining the codec type of 
// a video file.

// extract: This static method takes a VideoFile object as a parameter, 
// determines its codec type, and returns the appropriate Codec object. It 
// simulates extracting the codec from the video file.


// In Bangla:

// এই ক্লাসটি ভিডিও ফাইল থেকে সঠিক কোডেক এক্সট্রাক্ট করে। এটি ভিডিও ফাইলের টাইপ অনুযায়ী সঠিক কোডেক নির্বাচন করে।

// extract: এই মেথডটি ভিডিও ফাইল থেকে কোডেক এক্সট্রাক্ট করে। এটি ভিডিও ফাইলের টাইপ অনুযায়ী সঠিক কোডেক নির্বাচন করে এবং রিটার্ন করে।