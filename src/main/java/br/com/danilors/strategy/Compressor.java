package br.com.danilors.strategy;

/**
 * The Strategy interface. It declares a method that the context uses to execute a strategy.
 */
public interface Compressor {
    /**
     * Compresses a file.
     * @param fileName The name of the file to compress.
     */
    void compress(String fileName);
}
