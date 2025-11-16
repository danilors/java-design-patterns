package br.com.danilors.memento;

// Originator
public class Editor {

    private String content;

    public EditorState createState(){
            return new EditorState(this.content);
    }

    public void restore(EditorState editorState){
        content = editorState.getState();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
