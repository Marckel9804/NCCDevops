package org.Ncc.Mar.t06.quiz47;

public class MovieThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("영화를 재생합니다.");
            try {
                sleep(1000);
            } catch (InterruptedException e){}
        }
    }
}
