package creational.abstractFactory.shapes;

import creational.abstractFactory.interfaces.Shape;

public class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
