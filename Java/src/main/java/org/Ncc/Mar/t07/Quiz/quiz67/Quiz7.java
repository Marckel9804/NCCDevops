package org.Ncc.Mar.t07.Quiz.quiz67;


import java.util.Scanner;

public class Quiz7 {
    public static void high(int[][]arr,int a,int b) {
        int max=-1000;
        Scanner sc = new Scanner(System.in);
        int maxi=0,maxj=0;
        for (int i=0; i<a;i++) {
            for (int j=0; j<b; j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]>max){
                    maxi = i;
                    maxj = j;
                }
            }
        }
        System.out.println(arr[maxi][maxj]);
    }
    public static void main(String[] args) {
        int[][] ary=new int[3][3];

        high(ary,3,3);


    }
}
