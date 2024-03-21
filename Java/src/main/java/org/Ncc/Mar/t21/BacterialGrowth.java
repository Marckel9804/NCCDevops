package org.Ncc.Mar.t21;

import java.util.Scanner;

public class BacterialGrowth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            n=n*2;
        }
        System.out.println(n);
    }
}
