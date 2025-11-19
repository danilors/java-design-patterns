package br.com.danilors.flyweight;

/**
 * The Tree class holds the extrinsic state (contextual information) for a tree.
 * It references a shared TreeType (flyweight).
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type; // Reference to the flyweight

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y);
    }
}
