package org.Ncc.Mar.t08.fileIOStreamEx;

import java.io.FileWriter;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args) throws IOException {
        char a = 'S';
        char b = 'W';
        //파일 생성해서 문자저장
        FileWriter out = new FileWriter("C:\\Users\\Changho\\Desktop\\a.txt");
        out.write(a);
        out.write(b);
        out.close();
    }
}
