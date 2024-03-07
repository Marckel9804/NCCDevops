package org.Ncc.Mar.t05.multiThreadEx;

public class Th extends Thread{ //Thread 기본 클래스 상속
    String name;
    Th(String name ) {
        this.name = name;
    }

    @Override
    public void run() {     //start메소드 호출시키면 run 매소드가 실행됨
        for (int i=0; i<10; i++) {
            System.out.println(name);
            try {
                sleep(1000);
            } catch (Exception e ){}
        }
    }
}
