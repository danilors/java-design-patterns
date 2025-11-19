package br.com.danilors.command;

/**
 * LightOffCommand is a 'ConcreteCommand' that encapsulates the action of turning a light off.
 */
public class LightOffCommand implements Command {
    private Light light; // The receiver

    /**
     * Constructs a LightOffCommand with the specified light.
     * @param light the light to turn off
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * Executes the command by calling the 'off' method of the light.
     */
    @Override
    public void execute() {
        light.off();
    }
}
