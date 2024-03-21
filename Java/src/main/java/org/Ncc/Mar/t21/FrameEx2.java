package org.Ncc.Mar.t21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class FrameEx2 extends JFrame {
    String[] s = {"mococo", "coni"};

    ImageIcon[] im = {new ImageIcon("C:/Users/Changho/Desktop/mococo.jpg"),
            new ImageIcon("C:/Users/Changho/Desktop/coni.jpg")};
    JLabel j = new JLabel(im[0]);

    FrameEx2() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setVisible(true);

        JComboBox com = new JComboBox(s);
        c.add(j);
        c.add(com);

        com.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox c = (JComboBox) e.getSource();
                int i = c.getSelectedIndex();
                //콤보박스의 선택된 아이템 인덱스 알아내기
                j.setIcon(im[1]);
            }
        });
    }
    public static void main(String[] args) {
        new FrameEx2();
    }
}
