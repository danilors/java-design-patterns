package br.com.danilors.bridge;

/**
 * RadioDevice is a concrete implementation of the Device interface.
 */
public class RadioDevice implements Device {
    private boolean enabled = false;
    private int volume = 20;
    private int channel = 1; // Represents frequency for radio

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
        System.out.println("Radio is ON");
    }

    @Override
    public void disable() {
        enabled = false;
        System.out.println("Radio is OFF");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
        System.out.println("Radio volume set to " + this.volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Radio frequency set to " + this.channel + " MHz");
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm Radio.");
        System.out.println("| I'm " + (enabled ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current frequency is " + channel + " MHz");
        System.out.println("------------------------------------\n");
    }
}
