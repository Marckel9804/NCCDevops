package org.example.Ncc.Feb.B26;

//매개변수 생성자
class Car2{
    String name;
    String color;
    int maxSpeed;
    Car2(String n,String c,int ms){
        name = n;
        color = c;
        maxSpeed = ms;
    }

}
public class CarExample2 {
    public static void main(String[] args) {
        Car2 myCar = new Car2("그랜저","검정",250);
        System.out.println(myCar.name + myCar.color + myCar.maxSpeed);
    }
}
