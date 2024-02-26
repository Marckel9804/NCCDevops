package org.example.Ncc.Feb.B26;

//생성자 오버로딩
class Car3{
    String company = "현대";
    String model;
    String color;
    int maxSpeed;

    //생성자들
    //각 생성자들 마다 매개변수 내용이 달라야함
    Car3(){}
    Car3(String model){
        this.model = model;
    }
    Car3(String model, String color){
        this.model = model;
        this.color = color;
    }
    Car3(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void print(){
        System.out.println(company + " " + model + " " + color + " " + maxSpeed);
    }
}
public class CarExample3 {
    public static void main(String[] args) {
        Car3 car = new Car3();
        car.print();

        Car3 car2 = new Car3("소형차");
        car2.print();

        Car3 car3 = new Car3("자가용", "흰색");
        car3.print();

        Car3 car4 = new Car3("택시", "검정", 350);
        car4.print();
    }
}
