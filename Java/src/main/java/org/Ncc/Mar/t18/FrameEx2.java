package org.Ncc.Mar.t18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Check implements ItemListener {
    JRadioButton b1, b2, b3;
    Check(JRadioButton b1, JRadioButton b2, JRadioButton b3){
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
        }
        else {  //체크박스 선택 안했을 시
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
        }
    }
}
public class FrameEx2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new GridLayout(0,1));

        JCheckBox jc = new JCheckBox("선택");
        JRadioButton b1 = new JRadioButton("java");
        JRadioButton b2 = new JRadioButton("python");
        JRadioButton b3 = new JRadioButton("c++");

        //레이도 버튼 하나만 선택하기 위해
        ButtonGroup g1  = new ButtonGroup();
        g1.add(b1); g1.add(b2); g1.add(b3);

        jFrame.add(jc);
        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.add(b3);
        //라디오버튼 비활성화
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);

        jc.addItemListener(new Check(b1,b2,b3));

        jFrame.setVisible(true);

        b1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("자바!!!!");
                }
            }
        });

        b2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("파이썬!!!!");
                }
            }
        });

        b3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("c++!!!!");
                }
            }
        });
    }
}
