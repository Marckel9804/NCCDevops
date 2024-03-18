package org.Study.Mar.s11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SwitchLunch {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] student = new int[n];

        for (int i = 0; i < n; i++) {
            student[i] = i+1;
        }

        //2차 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            // 몇번 공을 뽑았는지 입력
            int k = Integer.parseInt(st.nextToken());
            //k가 0이면 자리를 바꿀 필요가 없어서 넘기고
            // 아니면
            if (k != 0) {
                int tmp=student[i];
                int tmp2=0;
                //한칸씩 뒤로 미루고
                for (int j = i-k; j < i; j++) {
                    tmp2=student[j];
                    student[j]=tmp;
                    tmp=tmp2;
                }
                //해당 위치로 본인 옮기기
                student[i]=tmp2;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(student[i]+" ");
        }
    }
}
