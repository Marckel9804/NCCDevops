package org.Ncc.Mar.t06.thread3;

public class Share {
    synchronized void pr (String string) {
        for (int i=0; i<string.length(); i++) {
            System.out.print(string.charAt(i));
        }
        System.out.println();
    }
}