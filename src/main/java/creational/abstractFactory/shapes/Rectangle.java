package creational.abstractFactory.shapes;

import creational.abstractFactory.interfaces.Shape;

public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
