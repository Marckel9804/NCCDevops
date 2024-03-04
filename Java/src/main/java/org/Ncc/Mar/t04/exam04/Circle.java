package org.Ncc.Mar.t04.exam04;


public class Circle implements Figure{
    int r;
    Circle(int r) {
        this.r = r;
    }

    @Override
    public void circle_area() {
        System.out.println(Math.PI * r * r);
    }

    @Override
    public void rec_area() {

    }
}
