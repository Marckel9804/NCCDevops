package org.example.Ncc.Feb.B27;

class Printer{
    void println(int n){
        System.out.println(n);
    }
    void println(boolean n){
        System.out.println(n);
    }
    void println(double n){
        System.out.println(n);
    }
    void println(String n){
        System.out.println(n);
    }
}
public class Check6_16 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}
