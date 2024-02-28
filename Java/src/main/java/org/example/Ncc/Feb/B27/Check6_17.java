package org.example.Ncc.Feb.B27;


class Printer1{
    static void println(int n){
        System.out.println(n);
    }
    static void println(boolean n){
        System.out.println(n);
    }
    static void println(double n){
        System.out.println(n);
    }
    static void println(String n){
        System.out.println(n);
    }
}
public class Check6_17 {
    public static void main(String[] args) {
        Printer1.println(10);
        Printer1.println(true);
        Printer1.println(5.7);
        Printer1.println("홍길동");
    }
}
