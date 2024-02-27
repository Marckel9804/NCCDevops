package org.example.Ncc.Feb.B27;

public class Quiz5_2 {
    public static void main(String[] args) {
        int[][] ary = {{43,97},
                {34,77,87},
                {100,95,38,89}};
        int sum=0,cnt=0;

        for (int i=0; i<ary.length; i++){
            for (int j=0; j<ary[i].length; j++){
                sum+=ary[i][j];
                cnt++;
            }
        }
        System.out.printf("전체 합 : %d, 평균 : %.1f",sum,(double)sum/cnt);
    }
}
