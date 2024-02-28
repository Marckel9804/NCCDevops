package org.example.Ncc.Feb.B28.Quiz6;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<10; i++){
            for (int j=i+1; j<10; j++){
                if (arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i=0; i<10; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
