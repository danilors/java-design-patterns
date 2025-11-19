package br.com.danilors.prototype;

/**
 * Circle is a 'ConcretePrototype' that extends Shape.
 */
public class Circle extends Shape {
    private int radius;

    public Circle() {
        type = "Circle";
    }

    public Circle(int radius) {
        this();
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius + " and ID " + id);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
