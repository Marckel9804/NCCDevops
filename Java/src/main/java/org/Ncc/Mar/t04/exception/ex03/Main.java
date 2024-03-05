package org.Ncc.Mar.t04.exception.ex03;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc cal = new Calc();

        int n;

        while (true) {
            try {
                System.out.print("5~10 의 정수 입력 : ");
                n=sc.nextInt();
                if (n>=5 && n<=10){
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.print("다시 입력 : ");
                sc.next();
            }
        }
        cal.calculate(n);
    }
}
