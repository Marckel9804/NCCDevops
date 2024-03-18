package org.Ncc.Mar.t15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;


public class FrameEx8 extends JFrame {
    FrameEx8(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setVisible(true);

        JCheckBox j = new JCheckBox();
        c.add(j);

        j.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("자바 재밌당");
                }
            }
        });
    }

    public static void main(String[] args) {
        new FrameEx8();
    }
}
