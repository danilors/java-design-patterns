package br.com.danilors.memento;

/**
 * The Memento class. This class holds the state of the {@link Editor}.
 */
public class EditorState {
    private final String state;

    /**
     * Constructor for the EditorState.
     * @param state The state to be saved.
     */
    public EditorState(String state) {
        this.state = state;
    }

    /**
     * Gets the saved state.
     * @return The saved state.
     */
    public String getState() {
        return state;
    }
}
