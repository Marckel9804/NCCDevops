package org.Ncc.Mar.t06.quiz14.quiz4;

public class AThread extends Thread{
    Total t;
    int a,b;

    AThread(Total t, int a, int b) {
        this.t = t;
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        for (int i =a; i<=b; i++) {
            t.total(i);
        }
        System.out.println("a sum = " + t.get());
    }
}
