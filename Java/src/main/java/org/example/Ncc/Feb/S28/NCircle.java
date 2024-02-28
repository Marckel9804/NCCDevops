package org.example.Ncc.Feb.S28;

public class NCircle extends Circle{
    String color;
    NCircle(int r, String color){
        super(r);
        this.color = color;
    }

    @Override
    void show() {
        System.out.println("반지름 : " + getR() + " 색상 : " + color);
    }
}
