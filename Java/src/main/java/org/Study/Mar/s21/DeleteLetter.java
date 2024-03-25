package org.Study.Mar.s21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DeleteLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        String letter = br.readLine();

        String answer = "";
        for(int i = 0; i<my_string.length(); i++) {
            if(letter.charAt(0) == my_string.charAt(i)){
                continue;
            }
            answer = answer+my_string.charAt(i);
        }
        System.out.println(answer);
    }
}
