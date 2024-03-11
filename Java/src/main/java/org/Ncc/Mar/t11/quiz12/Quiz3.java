package org.Ncc.Mar.t11.quiz12;


import java.io.FileReader;
import java.io.IOException;

public class Quiz3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("SampleFile/test01.txt");
        int str=-1;

        while ((str=fr.read())!=-1) {
            try {
                System.out.print((char)str);
            } catch (Exception e){break;}
        }
        fr.close();
    }
}
