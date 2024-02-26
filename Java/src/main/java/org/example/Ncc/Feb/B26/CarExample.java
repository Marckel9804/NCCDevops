package org.example.Ncc.Feb.B26;

//필드값과 기본 생성자
class Car{
    public String company = "현대 자동차";
    public String model = "그랜저";
    public String color = "검정";
    public int maxSpeed = 350;
    public int speed;
}
public class CarExample {
    public static void main(String[] args) {
        //Car 객체 선언
        Car myCar = new Car();

        //Car 객체의 필드값 읽기
        System.out.println("제작회사 : "+myCar.company);
        System.out.println("모델명 :"+ myCar.model);
        System.out.println("색 : "+myCar.color);
        System.out.println("최고 속도 : "+myCar.maxSpeed);
        System.out.println("현재 속도 : "+myCar.speed);

        //Car 객체의 필드값 변경
        myCar.speed = 60;
        System.out.println("수정된 속도 : " + myCar.speed);
    }
}
