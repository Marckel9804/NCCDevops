package org.Ncc.Mar.t06.thread2;

public class Sh {
    private int num=0;

    public void add() {
        int n = num;
        Thread.yield();
        n+=10;
        num = n;
        System.out.println(num);
    }

    public int getNum() {
        return num;
    }
}
