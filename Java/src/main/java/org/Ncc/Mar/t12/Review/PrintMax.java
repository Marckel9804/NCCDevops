package org.Ncc.Mar.t12.Review;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrintMax {
    public static void main(String[] args) throws IOException {
        //5개의 정수형
        int[] arr = new int[5];
        int max=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
