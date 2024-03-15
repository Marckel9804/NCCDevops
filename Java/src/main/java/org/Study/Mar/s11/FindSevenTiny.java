package org.Study.Mar.s11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindSevenTiny {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //배열 입력
        int[] arr = new int[9];
        int sum =0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        //배열 정렬
        Arrays.sort(arr);

        //선택할 두명의 난쟁이 고르기 -> sum -(x+y) = 100
        int x=-1,y=-1;
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if(sum -(arr[i]+arr[j])==100){
                    x=i;
                    y=j;
                    break;
                }
            }
            if(x!=-1 && y!=-1){
                break;
            }
        }
        // 배열 한개씩 출력
        for (int i = 0; i < 9; i++) {
            //arr[x], arr[y]는 출력하지 않고 다음 i로 넘어가기
            if(i==x || i==y){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
