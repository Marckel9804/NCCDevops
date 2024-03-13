package org.Ncc.Mar.t13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Mouse extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("마우스 클릭됨");
    }
}
public class FrameEx3 {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setLayout(new FlowLayout());

        JButton j1 = new JButton("one");
        JButton j2 = new JButton("two");

        j.add(j1);
        j.add(j2);

        j.setVisible(true);

        //one 버튼 마우스로 클릭했을때의 이벤트
        j1.addMouseListener(new Mouse());
    }
}
