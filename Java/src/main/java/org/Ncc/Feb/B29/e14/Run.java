package org.Ncc.Feb.B29.e14;

public class Run {
    public static void main(String[] args) {
        //Addin a = new Addin(); // 인터페이스라 객체생성 불가능
        Add a = new Add();
        System.out.println(a.add(8,9));
        System.out.println(a.add(8));
        a.pr();
    }
}
