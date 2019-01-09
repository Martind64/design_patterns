package structural.bridgePattern.concreteImplementor;

import structural.bridgePattern.implementor.WindowImp;

public class LinuxWindowImp implements WindowImp {

    public void draw() {
        System.out.println("Linux Window has been drawn");
    }
}
