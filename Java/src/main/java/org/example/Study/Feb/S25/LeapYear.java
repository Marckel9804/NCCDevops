package org.example.Study.Feb.S25;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        if(num%4==0){
            if(num%400==0){
                res=1;
            }
            else if(num%100 ==0){}
            else {
                res =1;
            }
        }
        System.out.println(res);
    }
}
