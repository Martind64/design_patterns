package creational.abstractFactory.factory;

import creational.abstractFactory.interfaces.AbstractFactory;
import creational.abstractFactory.interfaces.Color;
import creational.abstractFactory.interfaces.Shape;
import creational.abstractFactory.shapes.Circle;
import creational.abstractFactory.shapes.Rectangle;
import creational.abstractFactory.shapes.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
