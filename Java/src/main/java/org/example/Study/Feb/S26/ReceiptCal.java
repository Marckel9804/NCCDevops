package org.example.Study.Feb.S26;

import java.util.Scanner;

public class ReceiptCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        int n = sc.nextInt();
        int a,b,sum = 0;

        for (int i=0; i<n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            sum = sum + a*b;
        }
        if(res == sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
