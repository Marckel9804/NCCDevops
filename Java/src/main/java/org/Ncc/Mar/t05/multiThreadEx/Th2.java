package org.Ncc.Mar.t05.multiThreadEx;

public class Th2 implements Runnable{
    String name;
    Th2(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println(name);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
