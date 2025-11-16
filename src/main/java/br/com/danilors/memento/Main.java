package br.com.danilors.memento;

/**
 * The Memento pattern is a behavioral design pattern that lets you save and restore the previous state of an object
 * without revealing the details of its implementation.
 *
 * The pattern has three main components:
 * <ul>
 *     <li>{@link Editor}: The Originator class. This class creates a memento containing a snapshot of its current internal state and
 * uses the memento to restore its internal state.</li>
 *     <li>{@link EditorState}: The Memento class. This class holds the state of the {@link Editor}.</li>
 *     <li>{@link History}: The Caretaker class. This class is responsible for keeping track of multiple mementos.
 * In this example, it stores a list of editor states.</li>
 * </ul>
 *
 */
 public class Main {

    /**
     * The main method.
     * @param args The arguments.
     */
     public static void main(String[] args) {
         var editor = new Editor();
         var history = new History();

         editor.setContent("State 1");
         history.push(editor.createState());


         editor.setContent("State 2");
         history.push(editor.createState());

         editor.setContent("State 3 to Undo");
         editor.restore(history.pop());

         assert "State 2".equals(editor.getContent());

         editor.restore(history.pop());
         assert "State 1".equals(editor.getContent());

         System.out.println(editor.getContent());

     }
}
