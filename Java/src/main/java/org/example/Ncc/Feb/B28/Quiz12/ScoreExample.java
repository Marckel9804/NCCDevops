package org.example.Ncc.Feb.B28.Quiz12;

import java.util.Scanner;

public class ScoreExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math = sc.nextInt();
        int eng = sc.nextInt();
        int com = sc.nextInt();

        Score s = new Score(math, eng, com);
        System.out.println("평균은" + s.avg());
    }
}
