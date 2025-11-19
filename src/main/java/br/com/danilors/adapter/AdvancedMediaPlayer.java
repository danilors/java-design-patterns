package br.com.danilors.adapter;

/**
 * The AdvancedMediaPlayer interface is the 'Adaptee' interface in the Adapter pattern.
 * It defines an existing interface that needs to be adapted.
 */
public interface AdvancedMediaPlayer {
    /**
     * Plays an MP4 file.
     * @param fileName the name of the MP4 file
     */
    void playMp4(String fileName);

    /**
     * Plays a VLC file.
     * @param fileName the name of the VLC file
     */
    void playVlc(String fileName);
}
