package org.Ncc.Mar.t06.quiz14.quiz4;

public class Main {
    public static void main(String[] args) {
        Total t = new Total();
        AThread a = new AThread(t, 1, 50);
        AThread b = new AThread(t, 51, 100);
        a.start();
        b.start();

        try {
            a.join();
            b.join();
        } catch (InterruptedException e) {}
    }
}
