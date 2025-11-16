package br.com.danilors.iterator;

/**
 * The Concrete Iterator class. This class implements the {@link Iterator} interface and is responsible for
 * managing the iteration state.
 */
public class ArrayIterator implements Iterator<String>{


    private final BrowseHistory browseHistory;
    private int index;

    /**
     * Constructor for the ArrayIterator.
     * @param browseHistory The {@link BrowseHistory} to iterate over.
     */
    public ArrayIterator(BrowseHistory browseHistory) {
        this.browseHistory = browseHistory;
    }

    /**
     * Checks if there is a next element in the collection.
     * @return True if there is a next element, false otherwise.
     */
    @Override
    public boolean hasNext() {
        return  (index < browseHistory.getCount());
    }

    /**
     * Gets the current element in the collection.
     * @return The current element.
     */
    @Override
    public String current() {
        return browseHistory.getUrl(index);
    }

    /**
     * Moves to the next element in the collection.
     */
    @Override
    public void next() {
        index++;
    }
}
