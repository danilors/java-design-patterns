package br.com.danilors.mediator;

import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    void testMediator() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("Hello from colleague 1");
        colleague2.send("Hello from colleague 2");
    }
}