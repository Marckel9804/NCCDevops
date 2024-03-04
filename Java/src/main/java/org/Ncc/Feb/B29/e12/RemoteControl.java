package org.Ncc.Feb.B29.e12;

public interface RemoteControl {
    //public 추상 메소드
    public void turnOn(); //abstract 없이 추상 메소드로 인식함
    default void turnOff() {    //직접 default를 붙여야 함수 구현 가능

    }
}
