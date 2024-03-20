package org.Study.Mar.s19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindAlpha {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == (char)(i+97)){
                    arr[i] = j;
                    break;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
