package org.Ncc.Mar.t14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrameEx2 extends JFrame {
    FrameEx2() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton b1 = new JButton("ok");
        JButton b2 = new JButton("cancel");

        c.add(b1);
        c.add(b2);
        setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ok");
                b1.setEnabled(false);
                b2.setEnabled(true);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("cancel");
                b2.setEnabled(false);
                b1.setEnabled(true);
            }
        });

    }

    public static void main(String[] args) {
        new FrameEx2();
    }
}
