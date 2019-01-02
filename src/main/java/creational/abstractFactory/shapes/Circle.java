package creational.abstractFactory.shapes;

import creational.abstractFactory.interfaces.Shape;

public class Circle implements Shape {

    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
