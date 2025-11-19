package br.com.danilors.mediator;

/**
 * The Mediator pattern defines an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
 */
public class ConcreteMediator implements Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    /**
     * Sets colleague 1.
     *
     * @param colleague1 the colleague 1
     */
    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    /**
     * Sets colleague 2.
     *
     * @param colleague2 the colleague 2
     */
    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    /**
     * Sends a message from a colleague to another.
     *
     * @param message the message to send
     * @param colleague the colleague sending the message
     */
    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.receive(message);
        } else {
            colleague1.receive(message);
        }
    }
}