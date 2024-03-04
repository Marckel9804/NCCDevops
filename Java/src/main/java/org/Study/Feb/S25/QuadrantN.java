package org.Study.Feb.S25;

import java.util.Scanner;

public class QuadrantN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res=0;

        if(a>0){
            if(b>0){
                res=1;
            }
            else {
                res=4;
            }
        }
        else if (a<0){
            if(b>0){
                res=2;
            }
            else {
                res=3;
            }
        }

        System.out.println(res);
    }
}
