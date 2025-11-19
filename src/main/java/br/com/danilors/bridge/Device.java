package br.com.danilors.bridge;

/**
 * The Device interface is the 'Implementation' in the Bridge pattern.
 * It defines the interface for implementation classes.
 */
public interface Device {
    /**
     * Checks if the device is enabled.
     * @return true if enabled, false otherwise
     */
    boolean isEnabled();

    /**
     * Enables the device.
     */
    void enable();

    /**
     * Disables the device.
     */
    void disable();

    /**
     * Gets the current volume of the device.
     * @return the current volume
     */
    int getVolume();

    /**
     * Sets the volume of the device.
     * @param volume the new volume
     */
    void setVolume(int volume);

    /**
     * Gets the current channel of the device.
     * @return the current channel
     */
    int getChannel();

    /**
     * Sets the channel of the device.
     * @param channel the new channel
     */
    void setChannel(int channel);

    /**
     * Prints the current status of the device.
     */
    void printStatus();
}
