package org.Study.Feb.S26;

import java.util.Scanner;

public class WhileCnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        while (true){
            int n = sc.nextInt();
            cnt++;
            if (n==0){
                break;
            }
        }
    }
}
