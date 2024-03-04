package org.Ncc.Mar.t04.exam02;

public class Test {
    public static void main(String[] args) {
        Com com = new Com();
        Ipad ipad = new Ipad();

        Tv tv = ipad;   //up
        Computer computer = ipad; //up

        ipad.ip();
    }
}
