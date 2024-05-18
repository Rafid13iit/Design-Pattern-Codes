package facade;

import some_complex_media_library.*;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        some_complex_media_library.VideoFile file = new some_complex_media_library.VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new some_complex_media_library.MPEG4CompressionCodec();
        } else {
            destinationCodec = new some_complex_media_library.OggCompressionCodec();
        }
        some_complex_media_library.VideoFile buffer = some_complex_media_library.BitrateReader.read(file, sourceCodec);
        some_complex_media_library.VideoFile intermediateResult = some_complex_media_library.BitrateReader.convert(buffer, destinationCodec);
        File result = (new some_complex_media_library.AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}


// This class acts as a facade, providing a simplified interface for video 
// conversion. It hides the complexity of the some_complex_media_library 
// package and provides a single method convertVideo for converting videos.

// convertVideo: This method is the entry point for clients to convert videos. 
// It takes the filename and format as parameters and handles the entire video 
// conversion process internally. Clients don't need to know the details of the 
// conversion process; they just need to call this method with the necessary 
// parameters.


// In Bangla:

// এই ক্লাসটি একটি facade হিসেবে কাজ করে, যেখানে ভিডিও রূপান্তরের জন্য একটি 
// সহজীকৃত ইন্টারফেস সরবরাহ করে। এটি some_complex_media_library প্যাকেজের 
// জটিলতা লুকিয়ে রাখে এবং ক্লায়েন্টের সাথে ইন্টারযুক্ত করার জন্য একটি একক 
// মেথড convertVideo প্রদান করে।

// convertVideo: এই মেথডটি ভিডিও রূপান্তরের জন্য ক্লায়েন্টের এন্ট্রি 
// পয়েন্ট। এটি ফাইলনেম এবং ফরম্যাট প্যারামিটার নিয়ে এবং অভ্যন্তরীণভাবে 
// সম্পূর্ণ ভিডিও রূপান্তর প্রক্রিয়াটি হ্যান্ডেল করে। ক্লায়েন্টদের এই 
// প্রক্রিয়ার বিবরণগুলি জানতে হয় না; তারা শুধুমাত্র এই মেথডটি নিয়ে যেতে 
// হবে যেখানে প্রয়োজনীয় প্যারামিটারগুলি সাথে কল করতে হবে।