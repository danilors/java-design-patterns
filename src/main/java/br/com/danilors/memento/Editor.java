package br.com.danilors.memento;

/**
 * The Originator class. This class creates a memento containing a snapshot of its current internal state and
 * uses the memento to restore its internal state.
 */
public class Editor {

    private String content;

    /**
     * Creates a new {@link EditorState} with the current content.
     * @return A new {@link EditorState} with the current content.
     */
    public EditorState createState(){
            return new EditorState(this.content);
    }

    /**
     * Restores the content from a given {@link EditorState}.
     * @param editorState The {@link EditorState} to restore the content from.
     */
    public void restore(EditorState editorState){
        content = editorState.getState();
    }

    /**
     * Gets the current content.
     * @return The current content.
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content.
     * @param content The content to be set.
     */
    public void setContent(String content) {
        this.content = content;
    }
}
