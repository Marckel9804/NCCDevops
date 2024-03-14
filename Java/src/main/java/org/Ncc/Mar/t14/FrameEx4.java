package org.Ncc.Mar.t14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class My implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b =(JButton)e.getSource();  //이벤트가 어디서 발생했냐

        if(b.getText().equals("클릭")){   //이벤트가 발생한 버튼 알아냄
            b.setText("click"); //버튼 이름 영어로 바꾸기
        } else {
            b.setText("클릭");
        }
    }
}
public class FrameEx4 extends JFrame {
    FrameEx4() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton b1 = new JButton("클릭");

        c.add(b1);
        setVisible(true);

        b1.addActionListener(new My());
    }

    public static void main(String[] args) {
        new FrameEx4();
    }
}
