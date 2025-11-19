package br.com.danilors.flyweight;

public class ConcreteFlyweight implements Flyweight {
    private int intrinsicState;

    public ConcreteFlyweight(int intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(int extrinsicState) {
        System.out.println("Intrinsic state: " + intrinsicState + ", extrinsic state: " + extrinsicState);
    }
}