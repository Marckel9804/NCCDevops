package org.Ncc.Mar.t06.thread2;

public class Student extends Thread{
    String name;
    Sh sh;
    Student(String name,Sh sh) {
        this.name = name;
        this.sh = sh;
    }

    @Override
    public void run() {
        for (int i =1; i<4;i++){
            try {
                sh.add();
                sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
}
