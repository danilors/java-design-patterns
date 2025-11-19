package br.com.danilors.adapter;

/**
 * Mp4Player is a concrete implementation of AdvancedMediaPlayer that can play MP4 files.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

    @Override
    public void playVlc(String fileName) {
        // Do nothing, Mp4Player cannot play VLC files
    }
}
