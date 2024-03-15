package org.Study.Mar.s11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bingo {
    //현재 빙고판이 3빙고인지 확인하는 함수
    static boolean check(int[][] arr){
        int cnt=0;

        for (int i = 0; i <5; i++) {
            //세로 확인
            if(arr[i][0]==0 && arr[i][1]==0 && arr[i][2]==0 && arr[i][3]==0 && arr[i][4]==0){
                cnt++;
            }
            //가로 확인
            if(arr[0][i]==0 && arr[1][i]==0 && arr[2][i]==0 && arr[3][i]==0 && arr[4][i]==0){
                cnt++;
            }
        }
        //대각선 확인하기
        if(arr[0][0]==0 && arr[1][1]==0 && arr[2][2]==0 && arr[3][3]==0 && arr[4][4]==0){
            cnt++;
        }
        if(arr[0][4]==0 && arr[1][3]==0 && arr[2][2]==0 && arr[3][1]==0 && arr[4][0]==0){
            cnt++;
        }
        //3빙고이면 true 아니면 false 리턴
        if(cnt >=3){
            return true;
        } else return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] board = new int[5][5];
        int[][] bingo = new int[5][5];
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                board[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //3빙고인지 확인하기 위한 변수
        boolean cnt=false;
        for(int i=0;i<25;i++){
            for (int j = 0; j < 25; j++) {
                //현재 사회자가 부른 숫자가 보드판의 숫자이면 0으로 바꾸기
                if(bingo[i/5][i%5]==board[j/5][j%5]){
                    board[j/5][j%5]=0;
                    //check static함수 실행해서 현재 보드판이 3빙고인지 확인하기
                    if(check(board)){
                        //현재 사회자가 숫자 부른 횟수 출력하고 종료
                        System.out.println(i+1);
                        cnt=true;
                        break;
                    }
                }
            }
            if(cnt){
                break;
            }
        }
    }
}
