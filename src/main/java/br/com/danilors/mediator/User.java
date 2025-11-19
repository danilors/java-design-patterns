package br.com.danilors.mediator;

/**
 * The User class is the 'Colleague' in the Mediator pattern.
 * It communicates with other colleagues through its mediator.
 */
public abstract class User {
    protected ChatroomMediator mediator;
    protected String name;

    /**
     * Constructs a User with a given mediator and name.
     * @param mediator the chatroom mediator
     * @param name the name of the user
     */
    public User(ChatroomMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    /**
     * Sends a message to the chatroom.
     * @param message the message to send
     */
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    /**
     * Receives a message from the chatroom.
     * @param message the message received
     */
    public void receive(String message) {
        System.out.println(name + " receives: " + message);
    }

    public String getName() {
        return name;
    }
}
