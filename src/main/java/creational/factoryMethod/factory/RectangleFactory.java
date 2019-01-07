package creational.factoryMethod.factory;

import creational.factoryMethod.interfaces.Shape;
import creational.factoryMethod.shapes.Rectangle;

public class RectangleFactory {

    public Shape createRectangle(){
        return new Rectangle();
    }
}
