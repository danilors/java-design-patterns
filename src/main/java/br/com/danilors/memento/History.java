package br.com.danilors.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * The Caretaker class. This class is responsible for keeping track of multiple mementos.
 * In this example, it stores a list of editor states.
 */
public class History {
    private List<EditorState> states = new ArrayList<>();

    /**
     * Pushes a new state to the history.
     * @param state The state to be saved.
     */
    public void push(EditorState state){
        this.states.add(state);
    }

    /**
     * Pops the last state from the history.
     * @return The last saved state.
     */
    public EditorState pop(){
        var lastIndax  = states.size() -1;
        var lastState = states.get(lastIndax);
        states.remove(lastState);
        return lastState;
    }
}
