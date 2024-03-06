package org.Ncc.Mar.t05.quiz3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("정수 2개 입력 : ");
                int a= sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a+b);
                break;
            } catch (InputMismatchException e) {
                System.out.println("실수는 안된다.");
                sc.next();
            }
        }
    }
}
