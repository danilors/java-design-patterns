package br.com.danilors.adapter;

/**
 * The MediaAdapter acts as the 'Adapter' in the Adapter pattern.
 * It converts the interface of AdvancedMediaPlayer into the MediaPlayer interface.
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;

    /**
     * Constructs a MediaAdapter based on the audio type.
     * @param audioType the type of audio to be played (e.g., "vlc", "mp4")
     */
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    /**
     * Plays the audio file by delegating to the appropriate advanced media player.
     * @param audioType the type of audio file
     * @param fileName the name of the audio file
     */
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
