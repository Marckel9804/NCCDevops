package org.Study.Mar.s15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MissionChangeScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] score = new double[n];
        int max = -1;
        double sum=0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken());
            if(k>max){
                max = k;
            }
            score[i]=k;
        }
        for (int i = 0; i < n; i++) {
            score[i]= score[i]/max*100;
            sum+=score[i];
        }
        System.out.println(sum/n);
    }
}
