package br.com.danilors.strategy;

/**
 * A concrete strategy. This class implements the {@link Filter} interface.
 */
public class BlackAndWhiteFilter implements Filter {
    /**
     * Applies a black and white filter to a file.
     * @param fileName The name of the file to apply the filter to.
     */
    @Override
    public void apply(String fileName) {
        System.out.println("Applying black and white filter to " + fileName);
    }
}
