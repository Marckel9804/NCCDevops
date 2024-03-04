package org.example.Ncc.Feb.B29.e12;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television(); //upcasting

        rc.turnOn(); //자식 클래스에 오버라이딩 된 turnOn 함수 실행
    }
}
