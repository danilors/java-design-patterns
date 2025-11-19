package br.com.danilors.bridge;

/**
 * The RemoteControl class is the 'Abstraction' in the Bridge pattern.
 * It defines the client interface and maintains a reference to an Implementation object.
 */
public class RemoteControl {
    protected Device device;

    /**
     * Constructs a RemoteControl with a specific device.
     * @param device the device to control
     */
    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    public void printStatus() {
        device.printStatus();
    }
}
