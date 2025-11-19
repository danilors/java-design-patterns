package br.com.danilors.command;

/**
 * LightOnCommand is a 'ConcreteCommand' that encapsulates the action of turning a light on.
 */
public class LightOnCommand implements Command {
    private Light light; // The receiver

    /**
     * Constructs a LightOnCommand with the specified light.
     * @param light the light to turn on
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * Executes the command by calling the 'on' method of the light.
     */
    @Override
    public void execute() {
        light.on();
    }
}
