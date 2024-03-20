package org.Ncc.Mar.t19;

import javax.swing.*;
import java.awt.*;

class Th extends Thread {
    JLabel j;

    Th(JLabel j) {
        this.j = j;
    }

    @Override
    public void run() {
        int n=0;
        while (true) {
            j.setText(Integer.toString(n));
            n++;
            try {
                sleep(1000);
            } catch (Exception e) {
                return;
            }
        }
    }
}
public class FrameEx3 extends JFrame {
    FrameEx3() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel j = new JLabel();
        c.add(j);

        Th t = new Th(j);   //스레드 객체 생성

        t.start();  //스레드 실행

        setVisible(true);
    }


    public static void main(String[] args) {
        new FrameEx3();
    }
}
