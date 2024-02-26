package org.example.Study.Feb.S26;

import java.util.Scanner;

public class DiceReward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res=0;

        if ( a==b && a==c){

        }
        else if (a==b || a==c || a==c){

        }
        else {
            if(a<b && a<c){
                res = a*100;
            }
            else if(b<a && b<c){
                res = b*100;
            }
            else if(c<a && c<b){
                res = c*100;
            }
        }

    }
}
