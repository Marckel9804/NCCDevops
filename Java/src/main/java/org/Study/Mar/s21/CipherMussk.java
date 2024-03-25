package org.Study.Mar.s21;

import java.util.Scanner;

public class CipherMussk {
    public static void main(String[] args) {
        String answer="";
        Scanner sc = new Scanner(System.in);
        String cipher = sc.nextLine();
        int code = sc.nextInt();

        for(int i=0; i<cipher.length(); i++) {
            if(i%code==code-1){
                answer=answer + cipher.charAt(i);
            }
        }
    }
}
