package org.Ncc.Feb.B29.e2;

public class Tv2 extends Tv{
    String brand;

    Tv2(int size, String brand) {
        super(size);
        this.brand = brand;
    }

    void show() {
        System.out.println(getSize() + " " + this.brand);
    }
}
