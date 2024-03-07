package org.Book.ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
        //ia.methodB(); -> B인터페이스 메소드라 호출 안됨
        System.out.println();

        InterfaceB ib = impl;
        //ib.methodA(); -> A인터페이스 메소드라 호출 불가
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
