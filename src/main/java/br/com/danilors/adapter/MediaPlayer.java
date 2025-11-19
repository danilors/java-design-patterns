package br.com.danilors.adapter;

/**
 * The MediaPlayer interface is the 'Target' interface in the Adapter pattern.
 * It defines the domain-specific interface that Client uses.
 */
public interface MediaPlayer {
    /**
     * Plays an audio file of a given type.
     * @param audioType the type of audio file (e.g., "mp3")
     * @param fileName the name of the audio file
     */
    void play(String audioType, String fileName);
}
