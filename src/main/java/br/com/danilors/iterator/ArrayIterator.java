package br.com.danilors.iterator;

public class ArrayIterator implements Iterator{


    private final BrowseHistory browseHistory;
    private int index;

    public ArrayIterator(BrowseHistory browseHistory) {
        this.browseHistory = browseHistory;
    }

    @Override
    public boolean hasNext() {
        return  (index < browseHistory.getCount());
    }

    @Override
    public String current() {
        return browseHistory.getUrl(index);
    }

    @Override
    public void next() {
        index++;
    }
}
