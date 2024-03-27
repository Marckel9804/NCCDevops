package org.Study.Mar.s26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class Make1 {
    //클래스 시작시 바로 할당 배열
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        //정수n 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // Integer 객체는 default 값 -> null
        // int 변수는 default 값 -> 0
        dp = new Integer[n+1];

        //0은 세개의 조건식에서 어떤 것을 하던지 1이 안됨
        //1은 세개의 조건식을 거치지 않고 바로 1이기에 0
        dp[0] = dp[1] = 0;

        //결과 출력
        System.out.println(result(n));
    }
    //최소 연산횟수를 반환하는 함수
    static int result(int n) {
        //최소 연산이 정해지지 않은 경우
        if(dp[n]==null){
            if(n%6==0){ // 6으로 나눠 떨어지는 경우
                // 1을 빼거나 3으로 나누거나 2로 나눈것 중에서 가장 작은 횟수로 정하기
                dp[n] = Math.min(result(n-1), Math.min(result(n/3), result(n/2))) + 1;
            } else if(n%3==0){ // 3으로 나눠 떨어지는 경우
                // 3으로 나눈거랑 1 뺀 것 중에서 작은걸로 연산횟수 정하기
                dp[n] = Math.min(result(n/3), result(n-1)) + 1;
            } else if(n%2==0){ // 2로 나눠 떨어지는 경우,
                // 2로 나눈거랑 1 뺀 것 중에서 작은걸로 연산횟수 정하기
                dp[n] = Math.min(result(n/2), result(n-1)) + 1;
            } else{ // 3하고 2 둘다 안 나눠지는 경우
                dp[n] = result(n-1) + 1;
            }
        }
        //0이나 1은 초기화를 0으로 해줬기에 0으로 바로 리턴해줌 -> 재귀함수 종료 반환
        return dp[n];
    }
}
