package creational.factoryMethod.factory;

import creational.factoryMethod.interfaces.Shape;
import creational.factoryMethod.shapes.Circle;
import creational.factoryMethod.shapes.Rectangle;

public class ShapeFactory {

    public Shape createShape(String shapeType){

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }

        return null;
    }
}
