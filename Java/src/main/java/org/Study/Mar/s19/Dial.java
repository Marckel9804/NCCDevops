package org.Study.Mar.s19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum=0;
        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'Z'){
                sum+=10;
            } else if(str.charAt(i)>='S'){
                sum+= (str.charAt(i))/3 - 19;
            } else {
                sum+= (str.charAt(i)+1)/3 - 19;
            }
        }
        System.out.println(sum);
    }
}
