package org.Ncc.Feb.B26;

import java.util.Scanner;

public class Test {
    static void func(int a, int b){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        a = num/5;
        b=num%5;

        System.out.printf("%d를 5로 나눈 몫 : %d\n,"+
                "5로 나눈 나머지 : %d", num, a,b);

    }
    public static void main(String[] args) {

        int a=0,b=0;
        func(a,b);

    }


}
