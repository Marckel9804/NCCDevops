package org.Ncc.Feb.B29.e13;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Arr a = new Arr(5);
        //객체 배열 5개

        while (true) {
            System.out.print("A. 학교친구");
            System.out.print("B. 직장동료");
            System.out.print("C. 종료");
            System.out.print("D. 출력");
            System.out.print("문자 입력");

            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);   //A~D주 하나 입력

            switch (c) {
                case 'A':
                    a.friend(c);
                    break;
                case 'B':
                    a.friend(c);
                    break;
                case 'C':
                    System .out.println("종료");
                    return;
                case 'D':
                    a.all();
                    break;
            }
        }
    }
}
