package org.example.Ncc.Feb.B27;

class Shape {
    int x,y;

    Shape(){
        this.x = 4;
        this.y = 5;
    }
    Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    void pr(){
        System.out.println(this.x + ", " + this.y);
    }
}

public class ShapeEx {
    public static void main(String[] args) {
        Shape s = new Shape();
        Shape s1 = new Shape(3,4);

        s.pr();     //4,5
        s1.pr();    //3,4
    }
}
