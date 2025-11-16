package br.com.danilors.strategy;

/**
 * A concrete strategy. This class implements the {@link Compressor} interface.
 */
public class JpegCompressor implements Compressor {
    /**
     * Compresses a file using the JPEG algorithm.
     * @param fileName The name of the file to compress.
     */
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing file " + fileName + " with JPEG");
    }
}
