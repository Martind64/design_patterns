package decoratorPattern.model;

import decoratorPattern.interfaces.Shape;

public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
