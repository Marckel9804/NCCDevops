package org.example.Study.Mar.s03;

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while (true) {
            int n = sc.nextInt();
            cnt++;
            if(n==0) {
                break;
            }
        }
        System.out.println("0까지의 입력된 숫자 = " + cnt);
    }
}
