package org.Ncc.Mar.t06.quiz14.quiz2;

public class Main {
    public static void main(String[] args) {
        Th t = new Th("쓰레드 1");
        Thread th = new Thread(t);
        th.start();
    }
}
