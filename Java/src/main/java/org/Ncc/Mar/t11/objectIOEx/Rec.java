package org.Ncc.Mar.t11.objectIOEx;

import java.io.Serializable;

public class Rec implements Serializable {
    int x,y;

    Rec(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void show() {
        System.out.println(x +  " " + y);
    }
}
