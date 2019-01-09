package structural.bridgePattern.redefinedAbstraction;

import structural.bridgePattern.abstraction.Window;
import structural.bridgePattern.implementor.WindowImp;

public class IconWindow extends Window {

    public IconWindow(WindowImp window) {
        super(window);
    }

    public void drawBorder() {
        System.out.println("Icon window border drawn");
    }
}
