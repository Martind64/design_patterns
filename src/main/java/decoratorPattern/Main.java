package decoratorPattern;

import decoratorPattern.decorators.RedShapeDecorator;
import decoratorPattern.interfaces.Shape;
import decoratorPattern.model.Circle;

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
