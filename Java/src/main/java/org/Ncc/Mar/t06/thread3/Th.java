package org.Ncc.Mar.t06.thread3;

public class Th extends Thread {
    Share s;
    String[] arr;
    Th(Share s, String[] arr) {
        this.arr = arr;
        this.s = s;
    }

    @Override
    public void run() {
        for (int i=0; i<arr.length; i++) {
            s.pr(arr[i]);
        }
    }
}
