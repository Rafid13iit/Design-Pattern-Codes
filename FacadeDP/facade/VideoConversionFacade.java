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
