package br.com.danilors.command;

import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    void testCommand() {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}