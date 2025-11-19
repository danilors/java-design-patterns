package br.com.danilors.mediator;

/**
 * ChatUser is a 'ConcreteColleague' that represents a user in the chatroom.
 */
public class ChatUser extends User {
    /**
     * Constructs a ChatUser with a given mediator and name.
     * @param mediator the chatroom mediator
     * @param name the name of the user
     */
    public ChatUser(ChatroomMediator mediator, String name) {
        super(mediator, name);
    }
}
