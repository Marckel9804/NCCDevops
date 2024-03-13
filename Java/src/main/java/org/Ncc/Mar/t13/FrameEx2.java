package org.Ncc.Mar.t13;

import javax.swing.*;
import java.awt.*;

public class FrameEx2 {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setLayout(new BorderLayout());

        j.add(new JButton("동"), BorderLayout.EAST);
        j.add(new JButton("서"), BorderLayout.WEST);
        j.add(new JButton("남"), BorderLayout.NORTH);
        j.add(new JButton("북"), BorderLayout.SOUTH);
        j.add(new JButton("중앙"), BorderLayout.CENTER);

        j.setVisible(true);
    }
}
