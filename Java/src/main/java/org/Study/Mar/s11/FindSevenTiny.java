package org.Study.Mar.s11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindSevenTiny {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum =0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        Arrays.sort(arr);

        int x=-1,y=-1;
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 9; j++) {
                if(sum -(arr[i]+arr[j])==100){
                    x=i;
                    y=j;
                    break;
                }
            }
            if(x!=-1 && y!=-1){
                break;
            }
        }
        for (int i = 0; i < 9; i++) {
            if(i==x || i==y){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
