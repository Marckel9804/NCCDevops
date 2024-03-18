package org.Study.Mar.s11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UnionSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean[][] square = new boolean[101][101];
        short maxi=0,maxj=0,mini=101,minj=101;

        //사각형 좌표 입력
        //총 4개의 사각형 입력 받을 것임
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            short a = Short.parseShort(st.nextToken());
            short b = Short.parseShort(st.nextToken());
            short c = Short.parseShort(st.nextToken());
            short d = Short.parseShort(st.nextToken());

            //최대 최소의 좌표 설정 -> 안하면 100 100 for문 돌리면됨
            if(c>maxi) maxi= c;
            if(a<mini) mini= a;
            if(d>maxj) maxj= d;
            if(b<minj) minj= b;

            //입력 받은 좌표-1 만큼 해당위치 1로 바꾸기
            Arrays.stream(square, a, c)
                    .forEach(row -> Arrays.fill(row, b, d, true));
        }
        //전체 좌표에서 1의 갯수 세기
        int cnt = 0;
        for (int i = mini; i <= maxi; i++) {
            for (int j = minj; j <= maxj; j++) {
                if(square[i][j]){
                    cnt++;
                }
            }
        }
        //전체 면적 출력 = cnt
        System.out.println(cnt);
    }
}
