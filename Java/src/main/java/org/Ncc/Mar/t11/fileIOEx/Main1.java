package org.Ncc.Mar.t11.fileIOEx;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //java.txt
        FileWriter fw = new FileWriter("java.txt");

        fw.write(br.readLine());
        fw.close();

    }
}
