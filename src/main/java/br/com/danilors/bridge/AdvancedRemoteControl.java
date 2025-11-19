package br.com.danilors.bridge;

/**
 * AdvancedRemoteControl is a 'RefinedAbstraction' that extends the basic RemoteControl
 * with additional functionalities, like mute.
 */
public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    /**
     * Mutes the device by setting its volume to 0.
     */
    public void mute() {
        System.out.println("Remote: Mute");
        device.setVolume(0);
    }
}
