package br.com.danilors.adapter;

/**
 * Mp3Player is a concrete implementation of MediaPlayer that can play MP3 files.
 */
public class Mp3Player implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported by Mp3Player.");
        }
    }
}
