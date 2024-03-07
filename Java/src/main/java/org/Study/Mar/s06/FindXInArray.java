package org.Study.Mar.s06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindXInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");
        
        int n = Integer.parseInt(arr1[0]);
        int x = Integer.parseInt(arr1[1]);

        for (int i = 0; i < n; i++) {
            if(x>Integer.parseInt(arr2[i])) {
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.print('\b');
    }
}
