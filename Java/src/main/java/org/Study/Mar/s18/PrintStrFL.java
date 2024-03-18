package org.Study.Mar.s18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStrFL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = br.readLine();
        }
        for (int i =0; i<n; i++) {
            System.out.println(arr[i].charAt(0)+""+arr[i].charAt(arr[i].length()-1));
        }
    }
}
