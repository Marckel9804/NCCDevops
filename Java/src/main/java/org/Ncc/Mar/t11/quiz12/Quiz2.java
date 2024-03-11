package org.Ncc.Mar.t11.quiz12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("SampleFile/test02.txt");

        while (true) {
            String input = sc.nextLine();
            if(input.equals("그만")){
                break;
            }
            fw.write(input);
        }
        fw.close();
    }
}
