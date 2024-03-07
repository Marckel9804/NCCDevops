package org.Study.Mar.s06;

import java.util.Scanner;

public class APlusB8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Case #%d: %d + %d = %d\n",
                    i+1,arr[i][0],arr[i][1],arr[i][0]+arr[i][1]);
        }
    }
}
