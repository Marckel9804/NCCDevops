package org.Ncc.Feb.B28.Quiz45;

public class XYZ extends XY{
    String color;

    public void color(String color){
        this.color = color;
    }

    @Override
    public void show() {
        System.out.println(getX() + "," + getY() + "," + color);
    }
}
