package org.Ncc.Mar.t15;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class My1 extends MouseAdapter{
    @Override
    public void mouseEntered(MouseEvent e) {
        JLabel j = (JLabel) e.getSource();
        j.setText("재밌어");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JLabel j = (JLabel) e.getSource();
        j.setText("자바는");
    }
}
public class FrameEx7 extends JFrame {
    FrameEx7(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setVisible(true);


        JLabel j1 = new JLabel("자바는"); //글자 이미지

        c.add(j1);

        j1.addMouseListener(new My1());
    }
    public static void main(String[] args) {
        new FrameEx7();
    }
}
