package org.Ncc.Mar.t04.quiz12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();

        while(true){
            try {
                r.setHeight(sc.nextInt());
                break;
            } catch (InputMismatchException e) {
                System.out.println("다시 입력");
                sc.next();
            }
        }
        while (true) {
            try {
                r.setWidth(sc.nextInt());
                break;
            } catch (InputMismatchException e) {
                System.out.println("다시 입력");
                sc.next();
            }
        }
        System.out.println(r.area());
    }
}
