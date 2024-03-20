package org.Study.Mar.s19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CompareByBack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();

        int big=0;
        for (int i = 2; i >= 0; i--) {
            if(str1.charAt(i)>str2.charAt(i)) {
                big = Integer.parseInt(str1);
                break;
            } else if (str1.charAt(i)<str2.charAt(i)) {
                big = Integer.parseInt(str2);
                break;
            }
        }
        System.out.println(big);
    }
}
