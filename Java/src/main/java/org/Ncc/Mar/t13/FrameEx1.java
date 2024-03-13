package org.Ncc.Mar.t13;

import javax.swing.*;
import java.awt.*;

public class FrameEx1 extends JFrame {
    FrameEx1(){
        super("java");  //제목 설정
        setVisible(true);   //프레임 출력 메소드

        JButton j1 = new JButton("버튼 1");
        JButton j2 = new JButton("버튼 2");
        JButton j3 = new JButton("버튼 3");

        //컨텐츠 판 만들기
        Container c = getContentPane();
        c.add(j1);
        c.add(j2);
        c.add(j3);

        c.setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new FrameEx1();    //

    }
}
