package org.Study.Feb.S22;

import java.util.Scanner;

//본문제는 각 숫자가 10^12 까지라서 int로 표현이 안된다는것을 명심하자
public class LittleJungmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long a = sc.nextLong();
        Long b= sc.nextLong();
        Long c = sc.nextLong();

        System.out.println(a+b+c);
    }
}

