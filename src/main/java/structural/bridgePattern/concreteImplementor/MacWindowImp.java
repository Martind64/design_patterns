package structural.bridgePattern.concreteImplementor;

import structural.bridgePattern.implementor.WindowImp;

public class MacWindowImp implements WindowImp {

    public void draw() {
        System.out.println("Mac window has been drawn");
    }
}
