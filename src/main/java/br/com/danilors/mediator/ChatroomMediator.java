package br.com.danilors.mediator;

/**
 * The ChatroomMediator interface is the 'Mediator' in the Mediator pattern.
 * It defines the interface for communicating with Colleague objects.
 */
public interface ChatroomMediator {
    /**
     * Sends a message from a sender user to other users in the chatroom.
     * @param message the message to send
     * @param sender the user sending the message
     */
    void sendMessage(String message, User sender);

    /**
     * Adds a user to the chatroom.
     * @param user the user to add
     */
    void addUser(User user);
}
