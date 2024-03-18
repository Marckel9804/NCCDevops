package org.Ncc.Mar.t15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FrameEx9 extends JFrame {
    FrameEx9() {
        Container c = getContentPane();
        setVisible(true);

        JCheckBox[] j = new JCheckBox[15];  //객체배열
        c.setLayout(new GridLayout(3,5));   //행열구조

        //객체를 생성해서 배열에 저장
        for(int i=0;i<j.length;i++){
            j[i] = new JCheckBox("check"+(i+1));
            c.add(j[i]);
        }
    }

    public static void main(String[] args) {
        new FrameEx9();
    }
}
