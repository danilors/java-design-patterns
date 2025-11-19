package br.com.danilors.flyweight;

/**
 * OakTreeType is a 'ConcreteFlyweight' that implements the TreeType interface.
 * It stores the intrinsic state (shared) for oak trees.
 */
public class OakTreeType implements TreeType {
    private String name = "Oak";
    private String color = "Green";
    private String texture = "Rough Bark";

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + name + " tree at (" + x + ", " + y + ") with color " + color + " and texture " + texture);
    }
}
