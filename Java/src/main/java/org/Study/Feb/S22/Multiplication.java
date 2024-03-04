package org.Study.Feb.S22;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int re1 = (b%10) * a;
        int re2 = ((b/10)%10) * a;
        int re3 = ((b/100)%10) * a;
        int sum = re1 + (re2*10) + (re3*100);
        System.out.println(re1);
        System.out.println(re2);
        System.out.println(re3);
        System.out.println(sum);
    }
}
