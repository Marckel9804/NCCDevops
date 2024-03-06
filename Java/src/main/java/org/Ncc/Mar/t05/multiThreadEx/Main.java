package org.Ncc.Mar.t05.multiThreadEx;

public class Main {
    public static void main(String[] args) {
        //Thread 클래스로 할당할 경우
        Th t = new Th("glgl");
        Th t2 = new Th("스레드2");
        //우선순위 높일려면 run()으로 실행
        t.start();
        t2.start();


        //Runable 인터페이스로 할 경우
        Th2 t3 = new Th2("스레드3");
        Thread t4 = new Thread(t3);
        t4.start();
    }
}
