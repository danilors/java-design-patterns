package br.com.danilors.iterator;

/**
 * The Iterator pattern is a behavioral design pattern that lets you traverse elements of a collection without
 * exposing its underlying representation (list, stack, tree, etc.).
 *
 * The pattern has three main components:
 * <ul>
 *     <li>{@link Iterator}: The Iterator interface. It declares the methods required for iterating over a collection.</li>
 *     <li>{@link ArrayIterator}: The Concrete Iterator class. This class implements the {@link Iterator} interface and is responsible for
 * managing the iteration state.</li>
 *     <li>{@link BrowseHistory}: The Concrete Aggregate class. This class has a collection of objects and a method for creating an iterator.</li>
 * </ul>
 */
public class Main {
    /**
     * The main method.
     * @param args The arguments.
     */
    public static void main(String[] args) {
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
