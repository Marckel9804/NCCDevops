package org.Study.Mar.s06;

import java.util.ArrayList;
import java.util.Scanner;

public class APlusB5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sum = new ArrayList<Integer>();

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0 && b==0){
                break;
            }
            sum.add(a+b);
        }
        for (int i = 0; i < sum.size(); i++) {
            System.out.println(sum.get(i));
        }
    }
}
