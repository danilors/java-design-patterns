package br.com.danilors.flyweight;

/**
 * PineTreeType is another 'ConcreteFlyweight' that implements the TreeType interface.
 * It stores the intrinsic state (shared) for pine trees.
 */
public class PineTreeType implements TreeType {
    private String name = "Pine";
    private String color = "Dark Green";
    private String texture = "Needle-like Leaves";

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + name + " tree at (" + x + ", " + y + ") with color " + color + " and texture " + texture);
    }
}
