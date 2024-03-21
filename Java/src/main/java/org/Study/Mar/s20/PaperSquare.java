package org.Study.Mar.s20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PaperSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[101][101];
        Arrays.stream(paper, 1, 100)
                .forEach(row -> Arrays.fill(row, 1, 100, false));
        int maxi=0,maxj=0,mini=101,minj=101;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a>maxi) maxi= b;
            if(a<mini) mini= a;
            if(b>maxj) maxj= b;
            if(b<minj) minj= b;

            for (int j = a; j < a+10; j++) {
                for (int k = b; k < b+10; k++) {
                    paper[j][k]=true;
                }
            }

        }
        //전체 좌표에서 1의 갯수 세기
        int cnt = 0;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if(paper[i][j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
