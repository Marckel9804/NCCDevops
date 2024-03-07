package org.Ncc.Mar.t06.generic.exam02;

public class Main {
    public static void main(String[] args) {
        St<String> s = new St<String>();
        s.push("히히");
        s.push("하하");
        s.push("호호");
        for (int i=0; i<3; i++){
            System.out.println(s.pop());
        }

        St<Integer> s2 = new St<Integer>();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        for (int i=0; i<3; i++){
            System.out.println(s2.pop());
        }
    }
}
