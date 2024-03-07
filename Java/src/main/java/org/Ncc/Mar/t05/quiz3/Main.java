package org.Ncc.Mar.t05.quiz3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("인원 입력");
        int n = sc.nextInt();
        Profile[] p = new Profile[n];

        for (int i=0; i<n; i++){
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("아이디 : ");
            String id = sc.next();
            p[i]= new Profile(name,id);
        }

        for (Profile k : p) {
            System.out.println(k.name + " " + k.id);
        }
    }
}
