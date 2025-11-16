package br.com.danilors.strategy;

/**
 * A concrete strategy. This class implements the {@link Compressor} interface.
 */
public class PngCompressor implements Compressor {
    /**
     * Compresses a file using the PNG algorithm.
     * @param fileName The name of the file to compress.
     */
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing file " + fileName + " with PNG");
    }
}
