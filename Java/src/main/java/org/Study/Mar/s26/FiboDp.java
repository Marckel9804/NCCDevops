package org.Study.Mar.s26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiboDp {
    //전역 변수로 배열 바로 선언
    static Integer[][] dp ;

    public static Integer[] countFibo(int n){
        //이미 횟수가 정해졌는지 확인
        if(dp[n][0] == null || dp[n][1] == null){
            // 숫자 n이면 0을 출력한 횟수를 n-1과 n-2로 재귀함수를 호출한 배열 dp[k][]의
            // dp[n-1]과 dp[n-2]가 0을 출력한 횟수를 더 해준다.
            dp[n][0] = countFibo(n-1)[0] + countFibo(n-2)[0];
            // 숫자 n이면 1을 출력한 횟수를 n-1과 n-2로 재귀함수를 호출한 배열 dp[k][]의
            // dp[n-1]과 dp[n-2]가 1을 출력한 횟수를 더 해준다.
            dp[n][1] = countFibo(n-1)[1] + countFibo(n-2)[1];
        }
        //이미 방문했으면
        //배열 dp[n][0] 과 dp[n][1]의 묶음 dp[n]을 반환한다.
        //이때, 0이나 1의 경우는 배열을 초기화해서 null값이 아니므로 최초로 종료되는 countFibo(k)가 된다.
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        // n 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++){
            int k = Integer.parseInt(br.readLine());
            // k마다 배열 동적 할당해서 초기화
            // dp[첫번째 인덱스][두번째 인덱스]
            // 첫번째 인덱스는 각 숫자들을 표현
            // 두번째 인덱스가 0이면 0을 출력한 횟수, 1이면 1을 출력한 횟수
            dp = new Integer[k+2][2]; //요거 0 입력 받았을 때를 생각해서 k+2개로 초기화

            // 0은 0을 출력하는 횟수 1, 1을 출력하는 횟수 0
            dp[0][0]=1; dp[0][1]=0;
            // 1은 0을 출력하는 횟수 0, 1을 출력하는 횟수 1
            dp[1][0]=0; dp[1][1]=1;

            //함수 실행해서 배열에 횟수들 채우기
            countFibo(k);

            //결과 출력
            System.out.println(dp[k][0]+ " " +dp[k][1]);
        }
    }
}
