package br.com.danilors.composite;

public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf operation");
    }
}