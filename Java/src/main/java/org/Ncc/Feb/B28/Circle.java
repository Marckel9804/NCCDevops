package org.Ncc.Feb.B28;

public class Circle {
    private int r;

    public Circle(int r) {
        this.r = r;
    }
    int getR(){
        return this.r;
    }
    void show() {
        System.out.println("반지름 : " + getR());
    }
}
