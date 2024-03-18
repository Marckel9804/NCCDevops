package org.Ncc.Mar.t18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameEx3 extends JFrame {
    JTextField jtf = new JTextField(20);
    JTextArea jta = new JTextArea(10,20);
    FrameEx3() {
        Container c = getContentPane();
        setVisible(true);
        c.setLayout(new FlowLayout());

        JLabel jl = new JLabel("ente키 입력");

        c.add(jtf);
        c.add(jl);
        c.add(new JScrollPane(jta));

        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField jt = (JTextField)e.getSource();
                jta.append(jt.getText()+"\n");

                jt.setText("");
            }
        });

    }

    public static void main(String[] args) {
        new FrameEx3();
    }
}
