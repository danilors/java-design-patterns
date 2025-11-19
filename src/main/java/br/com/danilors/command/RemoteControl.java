package br.com.danilors.command;

/**
 * The RemoteControl acts as the 'Invoker' in the Command pattern.
 * It holds a command and can execute it.
 */
public class RemoteControl {
    private Command command;

    /**
     * Sets the command to be executed when the button is pressed.
     * @param command the command to set
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * Simulates pressing a button on the remote control, which executes the assigned command.
     */
    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command assigned to this button.");
        }
    }
}
