package br.com.danilors.memento;

import java.util.ArrayList;
import java.util.List;

//Caretaker
public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        this.states.add(state);
    }

    public EditorState pop(){
        var lastIndax  = states.size() -1;
        var lastState = states.get(lastIndax);
        states.remove(lastState);
        return lastState;
    }
}
