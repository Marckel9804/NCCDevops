package org.Ncc.Mar.t07.hashSetEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        Set<Num> h = new HashSet<Num>();
        h.add(new Num(30));
        h.add(new Num(60));
        h.add(new Num(70));
        h.add(new Num(60));

        Iterator<Num> it = h.iterator();

        System.out.println(it.next().n);
        System.out.println(it.next().n);
        System.out.println(it.next().n);
        System.out.println(it.next().n);

    }
}
