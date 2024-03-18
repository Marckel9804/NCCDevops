package org.Ncc.Mar.t15;

import org.Ncc.Mar.t13.FrameEx1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FrameEx10 extends JFrame {
    JRadioButton j1 = new JRadioButton("짜장면");
    JRadioButton j2 = new JRadioButton("짬뽕");
    FrameEx10()  {
        Container c= getContentPane();
        setVisible(true);
        c.setLayout(new FlowLayout());
        ButtonGroup b1 = new ButtonGroup();
        b1.add(j1);
        b1.add(j2);
        c.add(j1);
        c.add(j2);

        A a = new A();
        j1.addItemListener(a);
        j2.addItemListener(a);
    }

    class A implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange()!=ItemEvent.SELECTED){
                return;
            }
            if(e.getItem()== j1){
                System.out.println("짜장");
            }
            if(e.getItem()== j2){
                getContentPane().setBackground(Color.magenta);
                System.out.println("짬뽕");
            }
        }
    }

    public static void main(String[] args) {
        new FrameEx10();
    }
}
