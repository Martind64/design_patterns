package creational.factoryMethod.factory;

import creational.factoryMethod.interfaces.Shape;
import creational.factoryMethod.shapes.Circle;

public class CircleFactory {

    public Shape createCircle(){
        return new Circle();
    }
}
