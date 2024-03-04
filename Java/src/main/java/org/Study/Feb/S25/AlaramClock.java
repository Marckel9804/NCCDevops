package org.Study.Feb.S25;

import java.util.Scanner;

public class AlaramClock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hour = sc.nextInt();
        int min= sc.nextInt();

        if(min-45<0){
            if(hour == 0){
                hour = 24;
            }
            hour--;
            min = min+15;
            System.out.println(hour + " " + min);
        }
        else {
            System.out.println(hour + " " + (min-45));
        }
    }
}
