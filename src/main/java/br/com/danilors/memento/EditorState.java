package br.com.danilors.memento;
// memento
public class EditorState {
    private String state;

    public EditorState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
