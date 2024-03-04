package org.Ncc.Feb.B29.e9;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle [] c  = new Circle[5];

        for (int i=0; i<5; i++) {
            double r = sc.nextDouble();
            c[i] = new  Cir(r);
            System.out.println(c[i].get());
        }
    }
}
