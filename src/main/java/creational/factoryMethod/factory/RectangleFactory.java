package creational.factoryMethod.factory;

import creational.factoryMethod.shapes.Rectangle;

public class RectangleFactory {

    public Rectangle createRectangle(){
        return new Rectangle();
    }
}
