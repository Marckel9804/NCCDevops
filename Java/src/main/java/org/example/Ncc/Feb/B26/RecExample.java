package org.example.Ncc.Feb.B26;

import java.util.Scanner;

class Rec{
    //필드
    int a,b;

    //생성자
    Rec(int a, int b){
        this.a = a;
        this.b = b;
    }

    //메소드
    void area(){
        System.out.println(a*b);
    }
}
public class RecExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Rec rec = new Rec(a,b);
        rec.area();

        Rec rec2 = new Rec(7,9);
        rec2.area();

    }
}
