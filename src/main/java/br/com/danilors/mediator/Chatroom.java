package br.com.danilors.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * The Chatroom class is the 'ConcreteMediator' in the Mediator pattern.
 * It implements the ChatroomMediator interface and manages communication between User objects.
 */
public class Chatroom implements ChatroomMediator {
    private List<User> users = new ArrayList<>();

    /**
     * Adds a user to the chatroom.
     * @param user the user to add
     */
    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " joined the chatroom.");
    }

    /**
     * Sends a message from a sender user to all other users in the chatroom.
     * @param message the message to send
     * @param sender the user sending the message
     */
    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            // Don't send the message back to the sender
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}
