package br.com.danilors.iterator;

/**
 * The Iterator interface. It declares the methods required for iterating over a collection.
 * @param <T> The type of elements in the collection.
 */
public interface Iterator<T> {
    /**
     * Checks if there is a next element in the collection.
     * @return True if there is a next element, false otherwise.
     */
    boolean hasNext();

    /**
     * Gets the current element in the collection.
     * @return The current element.
     */
    T current();

    /**
     * Moves to the next element in the collection.
     */
    void next();

}
