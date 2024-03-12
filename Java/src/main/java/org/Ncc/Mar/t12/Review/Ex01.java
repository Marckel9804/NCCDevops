package org.Ncc.Mar.t12.Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);

        //while문 이용해서 정수 입력하고 평균 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;

        int sum = 0, cnt =0;

        while ((n=Integer.parseInt(br.readLine()))!=0) {
            sum+=n;
            cnt++;
        }
        System.out.println(sum/cnt);
    }
}
