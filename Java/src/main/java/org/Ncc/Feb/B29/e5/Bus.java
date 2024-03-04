package org.Ncc.Feb.B29.e5;

public class Bus extends Car{
    //필드
    String number;

    //생성자
    Bus() {
        super();
    }

    //메소드

    @Override
    void run() {
        super.run();
    }

    @Override
    void stop() {
        System.out.println("버스가 멈춥니다.");
    }
}
