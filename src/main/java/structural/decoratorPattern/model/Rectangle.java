package structural.decoratorPattern.model;

import structural.decoratorPattern.interfaces.Shape;

public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
