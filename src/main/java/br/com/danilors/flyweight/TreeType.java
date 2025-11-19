package br.com.danilors.flyweight;

/**
 * The TreeType class acts as the 'Flyweight' interface.
 * It contains the intrinsic state of a tree (data that is shared).
 */
public interface TreeType {
    /**
     * Draws the tree at a specific location.
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    void draw(int x, int y);
}
