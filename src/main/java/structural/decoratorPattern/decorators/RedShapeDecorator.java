package structural.decoratorPattern.decorators;

import structural.decoratorPattern.interfaces.Shape;
import structural.decoratorPattern.interfaces.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        decoratedShape.draw();
        this.setRedBorder();
    }

    public void setRedBorder(){
        System.out.println("Border Color: Red");
    }
}
