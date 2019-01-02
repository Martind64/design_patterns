package creational.abstractFactory.factory;

import creational.abstractFactory.colors.Blue;
import creational.abstractFactory.colors.Green;
import creational.abstractFactory.colors.Red;
import creational.abstractFactory.interfaces.AbstractFactory;
import creational.abstractFactory.interfaces.Color;
import creational.abstractFactory.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}
