package org.Ncc.Mar.t19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameEx1 extends JFrame {
    FrameEx1() {
        Container c = getContentPane();
        setVisible(true);
        c.add(new Dia(), BorderLayout.NORTH );

    }
    class Dia extends Panel {
        JButton j = new JButton("이름 입력");
        JTextField j1 = new JTextField(10);
        JButton j2 = new JButton("확인"  );
        JButton j3 = new JButton("메세지");

        Dia(){
            setBackground(Color.pink);
            add(j);
            add(j1);
            add(j2);
            add(j3);

            j.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = JOptionPane.showInputDialog("이름 입력");
                    if (name != null) {
                        j1.setText(name);
                    }
                }
            });
            j2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int r = JOptionPane.showConfirmDialog(null, "계속?",
                            "확인", JOptionPane.YES_OPTION );
                    if(r==JOptionPane.CANCEL_OPTION) {
                        j1.setText("선택안함");
                    } else if (r == JOptionPane.YES_OPTION) {
                        j1.setText("예");
                    } else {
                        j1.setText("아니요");
                    }
                }
            });

            j3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "경고", "메세지",
                            JOptionPane.WARNING_MESSAGE);
                }
            });
        }
    }

    public static void main(String[] args) {
        new FrameEx1();
    }
}
