package org.example.Ncc.Feb.B26;

//메소드 오버로딩 예제
class Calculator{
    double areaRectangle(double width){
        return width*width;
    }
    double areaRectangle(double width, double height){
        return width*height;
    }
}
public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        double res1 = myCal.areaRectangle(10);

        double res2 = myCal.areaRectangle(10,20);

        System.out.println(res1);
        System.out.println(res2);
    }
}
