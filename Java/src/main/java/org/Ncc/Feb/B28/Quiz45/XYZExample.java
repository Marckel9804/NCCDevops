package org.Ncc.Feb.B28.Quiz45;

public class XYZExample {
    public static void main(String[] args) {
        XY x= new XY();
        x.set(1,2);
        x.show(); //1,2 출력
        XYZ xy=new XYZ();
        xy.set(4,5);
        xy.color("blue");
        xy.show(); //4,5,blue 출력
    }
}
