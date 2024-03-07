package org.Book.ch08.sec05;

public class RemoteControlExample2 {
    public static void main(String[] args) {
        //인터페이스 변수 선언
        RemoteControl rc;

        //Audio 객체를 생성하고 인터페이스 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        //디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);
    }
}
