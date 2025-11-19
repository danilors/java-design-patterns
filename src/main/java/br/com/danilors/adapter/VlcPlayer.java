package br.com.danilors.adapter;

/**
 * VlcPlayer is a concrete implementation of AdvancedMediaPlayer that can play VLC files.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        // Do nothing, VlcPlayer cannot play MP4 files
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}
