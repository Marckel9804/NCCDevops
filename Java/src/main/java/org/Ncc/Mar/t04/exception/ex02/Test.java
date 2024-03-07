package org.Ncc.Mar.t04.exception.ex02;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        System.out.print("양수 입력");

        try {
            int n = in();
            System.out.println(n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int in() throws Num {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        if(k<0) {
            Num num = new Num();
            throw num;
        }
        return k;
    }
}
