package org.Ncc.Mar.t06.quiz14.quiz3;

public class Timer extends Thread{
    @Override
    public void run() {
        for (int i=0; i<11; i++) {
            System.out.println(i);
            try {
                sleep(1000);

            } catch (InterruptedException e){}
        }
        System.out.println("깨어남");
    }
}
