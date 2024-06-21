package ch08.sec09;

import javax.print.DocFlavor;

public class InterfaceClmpl implements InterfaceC {
    @Override
    public void methodC() {
        System.out.println("InterfaceClmpl-methodB()");
    }

    @Override
    public void methodA() {
        System.out.println("InterfaceClmpl-methodA()");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceClmpl-methodB()");
    }
}
