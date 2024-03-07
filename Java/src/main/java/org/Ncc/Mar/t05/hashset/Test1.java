package org.Ncc.Mar.t05.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        HashSet<Num> h = new HashSet<Num>();
        h.add(new Num(30));
        h.add(new Num(60));
        h.add(new Num(40));
        h.add(new Num(60));

        Iterator<Num> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        //<> : angle breaking
    }
}
