package structural.bridgePattern.redefinedAbstraction;

import structural.bridgePattern.abstraction.Window;
import structural.bridgePattern.implementor.WindowImp;

public class ErrorWindow extends Window {

    public ErrorWindow(WindowImp window) {
        super(window);
    }

    public void drawBorder(){
        System.out.println("Error window border drawn");
    }

}
