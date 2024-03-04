package org.Study.Feb.S26;

import java.util.Scanner;

public class MultiAplusB {
    static void print(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        int[] b = new int[n];
        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();

        }
        for (int i=0;i<n; i++){
            print(a[i],b[i]);
        }
    }
}
