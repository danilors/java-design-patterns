package br.com.danilors.command;

/**
 * The Command interface represents a request as an object.
 * This is the 'Command' in the Command pattern.
 */
public interface Command {
    /**
     * Executes the command.
     */
    void execute();
}
