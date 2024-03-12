package org.Study.Mar.s11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UnionSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean[][] square = new boolean[101][101];
        short maxi=0,maxj=0,mini=101,minj=101;

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            short a = Short.parseShort(st.nextToken());
            short b = Short.parseShort(st.nextToken());
            short c = Short.parseShort(st.nextToken());
            short d = Short.parseShort(st.nextToken());

            if(c>maxi) maxi= c;
            if(a<mini) mini= a;
            if(d>maxj) maxj= d;
            if(b<minj) minj= b;

            Arrays.stream(square, a, c)
                    .forEach(row -> Arrays.fill(row, b, d, true));
        }
        int cnt = 0;
        for (int i = mini; i <= maxi; i++) {
            for (int j = minj; j <= maxj; j++) {
                if(square[i][j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
