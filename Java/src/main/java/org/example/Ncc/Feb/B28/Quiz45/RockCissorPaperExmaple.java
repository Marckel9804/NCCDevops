package org.example.Ncc.Feb.B28.Quiz45;

import java.util.Scanner;

public class RockCissorPaperExmaple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("영수 : ");
        String a = sc.next();
        System.out.print("철수 : ");
        String b = sc.next();


        if(a.equals("가위")){
            if(b.equals("가위")){
                System.out.println("비겼다.");
            } else if (b.equals("바위")){
                System.out.println("철수가 이겼다.");
            } else {
                System.out.println("영수가 이겼다.");
            }
        } else if (a.equals("바위")){
            if(b.equals("가위")){
                System.out.println("영수가 이겼다.");
            } else if (b.equals("바위")){
                System.out.println("비겼다.");
            } else {
                System.out.println("철수가 이겼다.");
            }
        } else {
            if(b.equals("가위")){
                System.out.println("철수가 이겼다.");
            } else if (b.equals("바위")){
                System.out.println("영수가 이겼다.");
            } else {
                System.out.println("비겼다.");
            }
        }
    }
}
