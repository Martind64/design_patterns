package creational.factoryMethod;

import creational.factoryMethod.factory.CircleFactory;
import creational.factoryMethod.factory.RectangleFactory;
import creational.factoryMethod.factory.ShapeFactory;
import creational.factoryMethod.interfaces.Shape;
import creational.factoryMethod.shapes.Circle;
import creational.factoryMethod.shapes.Rectangle;

public class Main {

    public static void main(String [] args)
    {
        // Standard Factory
        RectangleFactory rectangleFactory = new RectangleFactory();

        Rectangle rectangle = rectangleFactory.createRectangle();
        rectangle.draw();

        CircleFactory circleFactory = new CircleFactory();
        Circle circle = circleFactory.createCircle();
        circle.draw();

        // New line
        System.out.println();

        // Parameterized Factory
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle2 = shapeFactory.createShape("RECTANGLE");
        rectangle2.draw();

        Shape circle2 = shapeFactory.createShape("CIRCLE");
        circle2.draw();

    }
}
