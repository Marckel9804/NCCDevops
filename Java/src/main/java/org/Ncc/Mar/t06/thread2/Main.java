package org.Ncc.Mar.t06.thread2;

public class Main {
    public static void main(String[] args) {
        Sh sh = new Sh();
        Student th1 = new Student("jack",sh);
        Student th2 = new Student("tom",sh);
        th1.start();

        try {
            th1.join();
            th2.join();
        } catch (Exception e) {}

        th2.start();
    }
}
