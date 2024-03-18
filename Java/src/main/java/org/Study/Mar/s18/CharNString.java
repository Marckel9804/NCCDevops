package org.Study.Mar.s18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharNString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(str.charAt(n-1));
    }
}
