package org.Ncc.Feb.B29.e8;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Song[] s = new Song[2];     //객체 생성 배열
        for (int i=0; i<s.length; i++) {
            System.out.println("가수");
            String singer = sc.next();
            System.out.println("제목");
            String title = sc.next();

            s[i] = new Song(singer,title);
        }
        for (int i=0; i<s.length; i++){
            System.out.println(s[i].getSinger() + " " + s[i].getSong());
        }
    }
}
