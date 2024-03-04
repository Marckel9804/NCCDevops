package org.Study.Mar.s03;

import java.util.Scanner;

public class Check4_7 {
    public static void main(String[] args) {
        int budjet = 0;
        while (true) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");

            System.out.print("선택> ");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            if (option.equals("1")){
                System.out.print("예금액>");
                String str1 = sc.nextLine();
                budjet += Integer.parseInt(str1);
            } else if (option.equals("2")) {
                System.out.print("출금액>");
                String str2 = sc.nextLine();
                budjet -= Integer.parseInt(str2);
            } else if (option.equals("3")) {
                System.out.println("잔고>"+budjet);
            } else {
                System.out.println();
                break;
            }
            System.out.println("프로그램 종료");
        }
    }
}
