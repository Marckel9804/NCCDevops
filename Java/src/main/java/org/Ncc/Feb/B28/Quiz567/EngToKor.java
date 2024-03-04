package org.Ncc.Feb.B28.Quiz567;

import java.util.Scanner;

public class EngToKor {
    public static void main(String[] args) {
        String[] eng={"student","book","future","note"};
        String[] kor={"학생","책","미래","노트"};

        Scanner sc= new Scanner(System.in);
        int i=0;
        while(true){
            System.out.print("영어 단어 입력: ");
            String str = sc.next();
            if(str.equals(eng[0])){
                System.out.println(kor[0]);
            } else if(str.equals(eng[1])){
                System.out.println(kor[1]);
            } else if(str.equals(eng[2])){
                System.out.println(kor[2]);
            } else if(str.equals(eng[3])){
                System.out.println(kor[3]);
            } else if(str.equals("stop")){
                System.out.println("반복 종료");
                break;
            }
        }
    }
}
