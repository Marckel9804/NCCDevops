package org.Study.Mar.s20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxSquareCutPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] col = new int[a+1];
        int[] row = new int[b+1];
        Arrays.fill(col,0);
        Arrays.fill(row,0);
        col[a]=1;
        col[0]=1;
        row[b]=1;
        row[0]=1;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x==0){
                row[y]=1;
            } else {
                col[y]=1;
            }
        }
        int maxCol=0,maxRow=0;
        int tmp=0;
        for (int i = 0; i <= a; i++) {

            if(col[i]==1){
                if(maxCol<i-tmp){
                    maxCol=i-tmp;
                }
                tmp=i;
            }
        }
        tmp=0;
        for (int i = 0; i <= b; i++) {
            if(row[i]==1){
                if(maxRow<i-tmp){
                    maxRow=i-tmp;
                }
                tmp=i;
            }
        }
        System.out.println((maxCol)*(maxRow));
    }
}
