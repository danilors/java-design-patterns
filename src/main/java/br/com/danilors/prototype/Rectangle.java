package br.com.danilors.prototype;

/**
 * Rectangle is another 'ConcretePrototype' that extends Shape.
 */
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
        type = "Rectangle";
    }

    public Rectangle(int width, int height) {
        this();
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width " + width + ", height " + height + " and ID " + id);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
