package org.Ncc.Mar.t06.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(53);
        list.add(32);
        list.add(44);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            int n = it.next();
            System.out.println(n);
        }
    }
}
