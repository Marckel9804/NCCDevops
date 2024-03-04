package org.Ncc.Feb.B29.Quiz5;

//ctrl shift f = ?
public class XY {
    private int x, y;

    XY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getx() {
        return x;
    }

    int gety() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
