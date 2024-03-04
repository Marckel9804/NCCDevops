package org.Ncc.Mar.t04.exam02;

public class Ipad extends Tv implements Computer {
    Com c = new Com();
    @Override
    public void m() {
        c.m();
    }

    public void ip() {
        m();
        on();
    }
}
