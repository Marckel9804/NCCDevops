package org.Ncc.Mar.t06.thread;


public class Main {
    public static void main(String[] args) {
        Music m = new Music("음악재생");
        m.start();

        Movie m1 = new Movie("영화재생");
        Thread t = new Thread(m1);
        t.start();

        //
//        try {
//            m.join();
//            t.join();
//        } catch (Exception e) {}
    }
}