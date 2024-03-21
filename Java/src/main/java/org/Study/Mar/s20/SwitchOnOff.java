package org.Study.Mar.s20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SwitchOnOff {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 전구 초기화
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }

        // 남학생
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==1){   //남학생
                for(int j=0; j<n; j++) {
                    //뽑은 수의 배수의 스위치를 고른경우
                    if ((j+1) % b == 0) {
                        arr[j] = (arr[j] == 0?1:0);
                    }
                }
            } else {    //여학생
                arr[b-1] = arr[b-1] == 0?1:0;
                //대칭으로 전체 절반나눠서 양쪽을 한칸씩 검사
                for(int j=1; j<n/2; j++) {
                    //중심 바꾸기
                    if((b+j)-1 >= n || (b-j)-1 < 0)
                        break;
                    //대칭이면 바꾸기
                    if(arr[(b-j)-1] == arr[(b+j)-1]) {
                        arr[(b-j)-1] = (arr[(b-j)-1] == 0?1:0);
                        arr[(b+j)-1] = arr[(b+j)-1] == 0 ? 1 : 0;
                    } else {    //대칭 아닌것이 나오면 바로 끝낸다.
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            if(i%20==19){
                System.out.println();
            }
        }
        System.out.println();
    }
}
