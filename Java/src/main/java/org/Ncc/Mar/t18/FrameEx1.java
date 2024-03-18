package org.Ncc.Mar.t18;

import javax.swing.*;
import java.awt.*;

public class FrameEx1 extends JFrame {
    FrameEx1(){
        Container c = getContentPane();
        setVisible(true);
        c.setLayout(new FlowLayout());

        JLabel j = new JLabel("안녕하세요");

        ImageIcon i = new ImageIcon("C://Users//Changho//Desktop//mococo.jpg");
        JLabel j1 = new JLabel(i); //사진은 항상 JLabel 매개변수로 들어옴

        JLabel j2 = new JLabel("월요일이네요", SwingConstants.CENTER);

        c.add(j);
        c.add(j1);
        c.add(j2);

    }

    public static void main(String[] args) {
        new FrameEx1();
    }
}
