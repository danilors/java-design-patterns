package br.com.danilors.command;

/**
 * The Command pattern encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
 */
public class Invoker {
    private Command command;

    /**
     * Sets the command to be executed.
     *
     * @param command the command to be executed
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * Executes the command.
     */
    public void executeCommand() {
        command.execute();
    }
}