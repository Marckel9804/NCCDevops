package org.Study.Feb.S26;

import java.util.Scanner;

public class WhilePlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while (true){
            int n = sc.nextInt();
            sum += n;

            if(n==0){
                break;
            }
        }
        System.out.println(sum);
    }
}
