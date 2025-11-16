package br.com.danilors.iterator;

public class Main {
    static void main() {
        var history = new BrowseHistory();
        history.push("www.google.com");
        history.push("www.facebook.com");
        history.push("www.cnn.com");

         var iterator =  history.createIterator();
         while (iterator.hasNext()){
             var url = iterator.current();
             System.out.println(url);
             iterator.next();
         }

    }
}
