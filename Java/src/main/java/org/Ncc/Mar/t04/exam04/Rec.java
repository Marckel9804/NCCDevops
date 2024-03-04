package org.Ncc.Mar.t04.exam04;

public class Rec implements Figure{
    int x,y;
    Rec(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void circle_area() {

    }

    @Override
    public void rec_area() {
        System.out.println(x*y);
    }
}
