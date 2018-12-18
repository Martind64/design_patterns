package decoratorPattern.model;

import decoratorPattern.interfaces.Shape;

public class Circle implements Shape {
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
