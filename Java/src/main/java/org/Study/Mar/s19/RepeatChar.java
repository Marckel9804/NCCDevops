package org.Study.Mar.s19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepeatChar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                for (int l = 0; l < k; l++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
