package structural.bridgePattern;

import structural.bridgePattern.abstraction.Window;
import structural.bridgePattern.concreteImplementor.LinuxWindowImp;
import structural.bridgePattern.concreteImplementor.MacWindowImp;
import structural.bridgePattern.redefinedAbstraction.ErrorWindow;
import structural.bridgePattern.redefinedAbstraction.IconWindow;

public class Main {

    public static void main(String [] args)
    {
        Window macIconWindow = new IconWindow(new MacWindowImp());

        macIconWindow.windowImp.draw();
        macIconWindow.drawBorder();

        System.out.println();

        Window linuxIconWindow = new IconWindow(new LinuxWindowImp());
        linuxIconWindow.windowImp.draw();
        linuxIconWindow.drawBorder();

        System.out.println();

        Window macErrorWindow = new ErrorWindow(new MacWindowImp());
        macErrorWindow.windowImp.draw();
        macErrorWindow.drawBorder();

    }
}
