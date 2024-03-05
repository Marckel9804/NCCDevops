package org.Ncc.Mar.t04.ex06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[5];
        int cnt=0;
        int sum=0;

        //5개 정수 입력해서 총합
        while (cnt<5){
            try {
                System.out.println(cnt+1 + "번째 정수");
                n[cnt]= sc.nextInt();
                sum+=n[cnt];
                cnt++;

            } catch (InputMismatchException e) {
                System.out.println("정수아님");
                sc.next();
                //continue;
            }
            finally {

            }
        }
        System.out.println("총합" + sum);
    }
}