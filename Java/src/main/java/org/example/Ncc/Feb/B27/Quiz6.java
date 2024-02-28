package org.example.Ncc.Feb.B27;

import java.util.Scanner;

public class Quiz6 {
    static int MAX = -1;
    static int MIN = 100000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int minI=0,maxI=0,min=MIN,max=MAX,sum=0;

        System.out.print("5명 학생 점수 입력 : ");
        for (int i=0; i<5; i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
                maxI = i;
            }
            if(arr[i]<min){
                min = arr[i];
                minI = i;
            }
        }

        System.out.print("유효 점수: ");
        for (int i=0;i<5; i++){
            if((i==maxI) || (i==minI)){
                continue;
            }
            System.out.print(arr[i]+ " ");
            sum+=arr[i];
        }
        System.out.println("\b");

        System.out.printf("평균: %.1f",(double)sum/3 );
    }
}
