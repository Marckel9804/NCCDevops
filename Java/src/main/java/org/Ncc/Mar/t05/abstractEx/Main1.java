package org.Ncc.Mar.t05.abstractEx;

public class Main1 {
    public static void main(String[] args) {
        Profile p = new Log(5);

        p.add("서창호","seo");
        p.add("김창호","kim");
        p.add("이창호","lee");
        p.add("김창호","kim");
        p.add("이창호","lee");

        System.out.println(p.check("seo"));
        System.out.println();
    }
}
