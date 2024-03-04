package org.Ncc.Feb.B29.Quiz5;

public class XYZ extends XY{
    String color;
    XYZ(int x, int y, String color) {
        super(x,y);
        this.color = color;
    }
    void setxy(int x, int y){
        super.move(x,y);
    }
    void setColor(String color) {
        this.color = color;
    }

    void show() {
        System.out.println(getx() + "," + gety() + "인 "+ color + "색!");
    }
}
