package org.example.Study.Feb.S26;

import java.util.Scanner;

public class NSum {
    static int Sum(int n){
        if(n!=1){
            return n+Sum(n-1);
        }
        else {
            return n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(Sum(n));
    }
}
