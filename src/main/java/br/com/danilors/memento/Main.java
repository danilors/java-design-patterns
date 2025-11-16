package br.com.danilors.memento;

 public class Main {

     static void main() {
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
