package br.com.danilors.iterator;

/**
 * The Concrete Aggregate class. This class has a collection of objects and a method for creating an iterator.
 */
public class BrowseHistory {
    private String[] urls = new String[10];
    private int count;

    /**
     * Creates a new {@link Iterator} for this history.
     * @return A new {@link Iterator}.
     */
    public Iterator<String> createIterator(){
        return new ArrayIterator(this);
    }

    /**
     * Pushes a new url to the history.
     * @param url The url to be pushed.
     */
    public void push(String url){
        this.urls[count++] = url;
    }

    /**
     * Pops the last url from the history.
     * @return The last url.
     */
    public String pop(){
        return urls[--count];
    }

    /**
     * Gets the urls.
     * @return The urls.
     */
    public String[] getUrls() {
        return urls;
    }

    /**
     * Sets the urls.
     * @param urls The urls to be set.
     */
    public void setUrls(String[] urls) {
        this.urls = urls;
    }

    /**
     * Gets the count of urls.
     * @return The count of urls.
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the count of urls.
     * @param count The count of urls to be set.
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Gets the url at the given index.
     * @param index The index of the url.
     * @return The url at the given index.
     */
    public String getUrl(int index) {
        return urls[index];
    }
}
