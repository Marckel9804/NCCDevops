package org.Ncc.Mar.t06.arrayListEx.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            a.add(sc.next());   //입력한 문자열을 리스트에 삽입
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        int MAX = 0;

        for (int i = 1; i < a.size(); i++) {
            if(a.get(MAX).length() < a.get(i).length()) {
                MAX = i;
            }
        }
        System.out.println("제일 긴 문자열 : " + a.get(MAX));

//        ArrayList<Integer> k = new ArrayList<Integer>();
//        for (int i = 0; i < 5; i++) {
//            k.add(sc.nextInt());
//            if (k.get(i)>MAX){
//                MAX = k.get(i);
//            }
//        }
//        System.out.println(MAX);
    }
}
