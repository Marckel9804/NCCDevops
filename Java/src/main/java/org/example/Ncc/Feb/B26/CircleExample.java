package org.example.Ncc.Feb.B26;
class Circle{

    private int r;
    private String name;
    //Circle 클래스에서만 사용가능 ->은닉화

    void round(int a){
        this.r = a;
    }
    void namep(String str){
        this.name =str;
    }

    double area(){
        return 3.14*r*r;
    }
    void show(){
        System.out.println(name);
    }

    Circle (){

    }
}
public class CircleExample {
    public static void main(String[] args) {
        Circle circle = new Circle();

        //circle.r = 10;
        //circle.name = "창호" -> private들이라 접근 불가능

        circle.round(10);
        circle.namep("창호");

        System.out.println(circle.area());
        circle.show();
    }
}
