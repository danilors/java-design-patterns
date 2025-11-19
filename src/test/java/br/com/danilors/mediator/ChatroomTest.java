package br.com.danilors.mediator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChatroomTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testChatroomCommunication() {
        Chatroom chatroom = new Chatroom();

        User user1 = new ChatUser(chatroom, "Alice");
        User user2 = new ChatUser(chatroom, "Bob");
        User user3 = new ChatUser(chatroom, "Charlie");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);

        outContent.reset(); // Clear initial "joined" messages

        user1.send("Hi everyone!");
        String expectedOutput1 = "Alice sends: Hi everyone!\n" +
                                 "Bob receives: Hi everyone!\n" +
                                 "Charlie receives: Hi everyone!\n";
        assertEquals(expectedOutput1, outContent.toString());
        outContent.reset();

        user2.send("Hello Alice and Charlie!");
        String expectedOutput2 = "Bob sends: Hello Alice and Charlie!\n" +
                                 "Alice receives: Hello Alice and Charlie!\n" +
                                 "Charlie receives: Hello Alice and Charlie!\n";
        assertEquals(expectedOutput2, outContent.toString());
        outContent.reset();

        user3.send("Good to see you all!");
        String expectedOutput3 = "Charlie sends: Good to see you all!\n" +
                                 "Alice receives: Good to see you all!\n" +
                                 "Bob receives: Good to see you all!\n";
        assertEquals(expectedOutput3, outContent.toString());
        outContent.reset();
    }

    @Test
    void testSingleUserInChatroom() {
        Chatroom chatroom = new Chatroom();
        User user1 = new ChatUser(chatroom, "Solo");
        chatroom.addUser(user1);
        outContent.reset();

        user1.send("Is anyone here?");
        String expectedOutput = "Solo sends: Is anyone here?\n"; // No one else to receive
        assertEquals(expectedOutput, outContent.toString());
    }
}
