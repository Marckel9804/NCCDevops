package org.Ncc.Mar.t21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameEx3 {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setLayout(new FlowLayout());

        int n = (int)(Math.random()*50)+1;
        JLabel num = new JLabel(String.valueOf(n));
        j.add(num);

        j.setVisible(true);

        JButton plus = new JButton("+5");
        JButton minus = new JButton("-5");

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plus.setEnabled(false);
                int n = Integer.valueOf(num.getText());
                num.setText(Integer.toString(n+5));
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minus.setEnabled(false);
                int n = Integer.valueOf(num.getText());
                num.setText(Integer.toString(n-5));
            }
        });

        j.add(plus);
        j.add(minus);
    }
}
