package structural.bridgePattern.abstraction;

import structural.bridgePattern.implementor.WindowImp;

public abstract class Window {

    public WindowImp windowImp;

    public Window(WindowImp windowImp) {
        this.windowImp = windowImp;
    }

    public abstract void drawBorder();

}
