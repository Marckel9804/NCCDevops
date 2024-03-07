package org.Ncc.Mar.t06.quiz47;


public class quiz6 {
    public static void main(String[] args) {
        Thread th1=new MovieThread();
        th1.start();
        Thread th2=new Thread(new MusicThread());
        th2.start();
    }
}
