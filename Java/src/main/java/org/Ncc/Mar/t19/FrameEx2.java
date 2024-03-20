package org.Ncc.Mar.t19;

import javax.swing.*;
import java.awt.*;

public class FrameEx2 {
    public static void main(String[] args) {
        Color[] carr ={Color.RED, Color.ORANGE, Color.YELLOW,  Color.GREEN,
                        Color.BLUE};
        JFrame j = new JFrame();
        j.setLayout(new GridLayout(1,5));

        JButton[] buttons = new JButton[5]; //객체 배열

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttons[i].setBackground(carr[i]);
            j.add(buttons[i]);
        }

        j.setVisible(true);
    }
}
