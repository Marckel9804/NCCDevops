package org.Ncc.Feb.B29.e5;

public abstract class Car {
    //필드
    String name;

    //생성자
    Car() {

    }

    //메소드
    void run () {
        System.out.println("차가 움직인다.");
    }
    abstract void stop();  //추상 메소드 (껍데기 함수)
}
