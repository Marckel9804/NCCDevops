package org.Study.Mar.s11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SwitchLunch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] student = new int[n];

        for (int i = 0; i < n; i++) {
            student[i] = i+1;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken());
            if (k != 0) {
                int tmp=student[i];
                int tmp2=0;
                for (int j = i-k; j < i; j++) {
                    tmp2=student[j];
                    student[j]=tmp;
                    tmp=tmp2;
                }
                student[i]=tmp2;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(student[i]+" ");
        }
    }
}
