package org.Study.Mar.s11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReplaceBall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nm = br.readLine();
        StringTokenizer st = new StringTokenizer(nm);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n];
        for (int i = 0; i < n; i++) {
            basket[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            String xy = br.readLine();
            st = new StringTokenizer(xy);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int cnt = 1;
            for (int j = x-1; j < (x+y)/2; j++) {
                int tmp = basket[j];
                basket[j]= basket[y-cnt];
                basket[y-cnt]=tmp;
                cnt++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
