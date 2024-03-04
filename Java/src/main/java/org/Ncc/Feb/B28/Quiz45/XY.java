package org.Ncc.Feb.B28.Quiz45;

public class XY {
    private int x;
    private int y;

    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    void show() {
        System.out.println(this.x + "," + this.y);
    }
}
