package org.Ncc.Mar.t05.Quiz12;

public class Point {
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
