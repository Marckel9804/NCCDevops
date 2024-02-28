package org.example.Ncc.Feb.B27;

class Rectangle{
    int width;
    int height;

    int area(){
        return this.width*this.height;
    }
}
public class Problem4 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.width=5;
        rec.height=6;
        System.out.println("사각형의 면적 : " + rec.area());

    }

}
