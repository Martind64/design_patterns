package structural.decoratorPattern;

import structural.decoratorPattern.decorators.RedShapeDecorator;
import structural.decoratorPattern.interfaces.Shape;
import structural.decoratorPattern.model.Circle;

public class Main {

    public static void main(String [] args)
    {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(circle);

        redCircle.draw();
        System.out.println("----");
        circle.draw();

    }
}
