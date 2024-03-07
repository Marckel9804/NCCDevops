package org.Ncc.Mar.t06.thread3;


public class Main {
    public static void main(String[] args) {
        Share s = new Share();
        String[] eng = {"java","study","db","spring","jsp"};
        String[] kor = {"자바","공부","디비","스프링","제스피"};

        Th t1 = new Th(s,eng);
        Thread t2 = new Th(s,kor);

        t1.start();
        t2.start();
    }
}
