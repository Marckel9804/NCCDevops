package org.Ncc.Mar.t06;

import java.util.ArrayList;
import java.util.Iterator;

public class Quiz4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arr.add((int)(Math.random()*101));
        }
        Iterator<Integer> it = arr.iterator();
        for (int i = 0; i <10; i++) {
            System.out.println(it.next());
        }
    }
}
