package org.Study.Mar.s11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bingo {
    static boolean check(int[][] arr){
        int cnt=0;
        for (int i = 0; i <5; i++) {
            if(arr[i][0]==0 && arr[i][1]==0 && arr[i][2]==0 && arr[i][3]==0 && arr[i][4]==0){
                cnt++;
            }
            if(arr[0][i]==0 && arr[1][i]==0 && arr[2][i]==0 && arr[3][i]==0 && arr[4][i]==0){
                cnt++;
            }
        }
        if(arr[0][0]==0 && arr[1][1]==0 && arr[2][2]==0 && arr[3][3]==0 && arr[4][4]==0){
            cnt++;
        }
        if(arr[0][4]==0 && arr[1][3]==0 && arr[2][2]==0 && arr[3][1]==0 && arr[4][0]==0){
            cnt++;
        }
        
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

        int cnt=0;
        for(int i=0;i<25;i++){
            for (int j = 0; j < 25; j++) {
                if(bingo[i/5][i%5]==board[j/5][j%5]){
                    board[j/5][j%5]=0;
                    if(check(board)){
                        System.out.println(i+1);
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt!=0){
                break;
            }
        }
    }
}
