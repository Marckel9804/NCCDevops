package org.Ncc.Mar.t05.quiz4;

import java.util.Scanner;

public class ExceptionQuiz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int n = sc.nextInt();
                if(n%2 == 0) {
                    System.out.println("짝수");
                } else {
                    System.out.println("홀수");
                }
            } catch (Exception e){
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
