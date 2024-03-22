package org.Ncc.Mar.t22;

import javax.swing.*;
import java.awt.*;


public class JTableEx1 extends JFrame {
    private JTable jTable;
    JTableEx1() {
        this.getContentPane().add(new JScrollPane(gt()),
                BorderLayout.CENTER);
        setVisible(true);




    }

    public JTable gt() {
        if(jTable == null) {
            String[] str = {"아이디", "이름"};
            Object[][] ob = {{"서","창호"},
                    {"홍","길동"},
                    {"김","호균"}};

            jTable = new JTable(ob,str);
            jTable.getColumn("아이디").setPreferredWidth(100);
            jTable.getColumn("이름").setPreferredWidth(50);
        }
        return jTable;
    }

    public static void main(String[] args) {
        new JTableEx1();
    }
}
