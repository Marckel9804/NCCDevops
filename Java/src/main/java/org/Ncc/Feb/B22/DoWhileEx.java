package org.Ncc.Feb.B22;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        DoWhileEx dwe = new DoWhileEx();
        //dwe.ex1();
        //dwe.ex2();
    }
    public void ex1(){
        int n=1;
        int sum = 0;
        do{
            sum += n;
            n++;
        }while(n<=20);
        System.out.println(sum);
    }

    public void ex2(){
        String str;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("문자열 입력 : ");
            str = sc.next();

            if(str.equals("exit")){
                System.out.println("프로그램 종료");
            }
            else{
                System.out.println(str);
            }
        }while(!str.equals("exit"));
    }
}
