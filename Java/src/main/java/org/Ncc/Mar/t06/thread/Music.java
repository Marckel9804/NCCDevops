package org.Ncc.Mar.t06.thread;

public class Music extends Thread{
    String str;
    Music(String str) {
        this.str = str;
    }
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println(str);

        }
    }
}
