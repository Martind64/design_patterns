package creational.factoryMethod.factory;

import creational.factoryMethod.shapes.Circle;

public class CircleFactory {

    public Circle createCircle(){
        return new Circle();
    }
}
