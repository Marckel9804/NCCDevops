package org.example.Study.Feb.S25;

import java.util.Scanner;

public class OvenClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int timer = sc.nextInt();

        int res = hour*60+min +timer;

        System.out.println(((res/60)%24)+" "+(res%60));
    }
}
