package org.Ncc.Mar.t21;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class FrameEx1 extends JFrame {
    JButton j=new JButton("Cal");
    JLabel jl=new JLabel("계산 결과");

    FrameEx1(){
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(j);
        c.add(jl);

        setVisible(true);
        //Cal 버튼을 눌렀을때
        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aa a=new Aa();  //JDialog
                a.setVisible(true);
            }
        });
    }
    class Aa extends JDialog{
        JTextField f1=new JTextField(15);
        JTextField f2=new JTextField(15);

        JButton j2=new JButton("ADD");

        Aa(){
            setLayout(new FlowLayout());
            add(new JLabel("두 수를 더합니다"));
            add(f1);
            add(f2);
            add(j2);

            j2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false); //다이어로그창 종료됨
                    int sum=Integer.parseInt(f1.getText())+
                            Integer.parseInt(f2.getText());
                    jl.setText(Integer.toString(sum));
                }
            });
        }
    }
    public static void main(String[] args) {
        new FrameEx1();

    }
}
