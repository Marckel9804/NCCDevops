package org.Ncc.Mar.t06.thread;

public class Movie implements Runnable{
    String str;
    Movie(String str) {
        this.str = str;
    }
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println(str);

        }
    }
}

