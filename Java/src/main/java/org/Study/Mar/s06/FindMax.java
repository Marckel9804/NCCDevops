package org.Study.Mar.s06;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max =0;
        int cnt =0;
        for (int i = 1; i < 10; i++) {
            int k = sc.nextInt();
            if(max< k){
                max = k;
                cnt = i;
            }
        }
        System.out.println(max);
        System.out.print(cnt);
    }
}
