package org.Ncc.Mar.t06.quiz14.quiz2;

public class Th implements Runnable{
    String str;
    Th(String str){
        this.str = str;
    }
    @Override
    public void run() {
        System.out.println(str);
    }
}
