package structural.decoratorPattern.model;

import structural.decoratorPattern.interfaces.Shape;

public class Circle implements Shape {
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
