package org.Ncc.Mar.t04.exam01;

public class Test {
    public static void main(String[] args) {
        D d1 = new D();


        A a1 = d1;  //upCasting
        a1.funcA();

        B b1 = d1;
        b1.funcB();

        C c1 = d1;
        c1.funcA();
        c1.funcB();
        c1.funcC();

        d1.funcA();
        d1.funcB();
        d1.funcC();
    }
}
