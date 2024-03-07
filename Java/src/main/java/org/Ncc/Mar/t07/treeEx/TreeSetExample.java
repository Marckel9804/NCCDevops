package org.Ncc.Mar.t07.treeEx;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Pro> t = new TreeSet<Pro>();
        t.add(new Pro("aa",1244));
        t.add(new Pro("bb",123));
        t.add(new Pro("cc",1233));

        Iterator<Pro> it = t.iterator();

        while (it.hasNext()){
            it.next().show();   //오름차순 출력
        }

    }
}
