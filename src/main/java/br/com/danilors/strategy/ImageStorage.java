package br.com.danilors.strategy;

/**
 * The Context class. It uses a strategy to perform an operation.
 */
public class ImageStorage {

    private Compressor compressor;
    private Filter filter;

    /**
     * Constructor for the ImageStorage.
     * @param compressor The compressor to be used.
     * @param filter The filter to be used.
     */
    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    /**
     * Stores an image.
     * @param fileName The name of the file to store.
     */
    public void store(String fileName) {
     compressor.compress(fileName);
     filter.apply(fileName);
    }


}
