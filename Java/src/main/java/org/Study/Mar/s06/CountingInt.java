package org.Study.Mar.s06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingInt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        String[] arr = str.split(" ");

        int k = Integer.parseInt(br.readLine());
        int cnt=0;
        for (int i = 0; i < n; i++) {
            if (k == Integer.parseInt(arr[i])){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
