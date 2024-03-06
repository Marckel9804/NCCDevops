package org.Ncc.Mar.t05.Quiz12;


import org.Ncc.Feb.B29.e9.Cir;

public class Circle {
    private int r;
    Circle(int r){
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    public boolean equals(Object obj) {
        Circle c = (Circle) obj;
        if(this.r == c.getR()){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return Integer.toString(r);
    }
}
