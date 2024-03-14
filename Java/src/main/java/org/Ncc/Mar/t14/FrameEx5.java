package org.Ncc.Mar.t14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class Mouse extends MouseAdapter {
    @Override
    public void mouseDragged(MouseEvent e) {
        Container c = (Container) e.getSource();
        c.setBackground(Color.blue);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Container c = (Container) e.getSource();
        c.setBackground(Color.green);
    }
}

public class FrameEx5 extends JFrame {
    FrameEx5() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.green);

        setVisible(true);


        c.addMouseListener(new Mouse());
        c.addMouseMotionListener(new Mouse());
    }

    public static void main(String[] args) {
        new FrameEx5();
    }

}
