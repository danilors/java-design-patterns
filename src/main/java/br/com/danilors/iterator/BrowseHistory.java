package br.com.danilors.iterator;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count;

    public Iterator createIterator(){
        return new ArrayIterator(this);
    }

    public void push(String url){
        this.urls[count++] = url;
    }

    public String pop(){
        return urls[--count];
    }

    public String[] getUrls() {
        return urls;
    }

    public void setUrls(String[] urls) {
        this.urls = urls;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUrl(int index) {
        return urls[index];
    }
}

