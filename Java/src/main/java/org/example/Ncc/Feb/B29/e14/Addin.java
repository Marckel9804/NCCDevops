package org.example.Ncc.Feb.B29.e14;

public interface Addin {
    public int add(int a, int b);   //abstract
    public int add(int a); //메소드 오버로드

    default void pr() {     //not abstract -> 구현가능
        System.out.println("히히");
    }
}
