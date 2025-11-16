package br.com.danilors.strategy;

/**
 * The Strategy pattern is a behavioral design pattern that enables selecting an algorithm at runtime. Instead of
 * implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms
 * to use.
 *
 * The pattern has three main components:
 * <ul>
 *     <li>{@link ImageStorage}: The Context class. It uses a strategy to perform an operation.</li>
 *     <li>{@link Compressor}, {@link Filter}: The Strategy interfaces. They declare a method that the context uses to execute a strategy.</li>
 *     <li>{@link JpegCompressor}, {@link PngCompressor}, {@link BlackAndWhiteFilter}: Concrete strategies. These classes implement the strategy interfaces.</li>
 * </ul>
 */
public class Main {
    /**
     * The main method.
     * @param args The arguments.
     */
    public static void main(String[] args) {
        var imageStoreJpegBlackAndWhite = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStoreJpegBlackAndWhite.store("image.img");


        var imageStorePngBlackAndWhite = new ImageStorage(new PngCompressor(), new BlackAndWhiteFilter());
        imageStorePngBlackAndWhite.store("image.img");
    }
}
