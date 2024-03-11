package org.Ncc.Mar.t08.printstreamEx;

import java.io.*;

public class Example1 {
    public static void main(String[] args) throws IOException {
        //콘솔창에 문자를 입력해서 입력한 문자를
        // 파일에 저장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream pr = new PrintStream(new FileOutputStream("eedd.txt"));

        try {
            String str;
            while( (str = br.readLine())!=null){
                pr.println(str);
                //null 입력 -> ctrl z
            }
        } catch ( Exception e) {}
        finally {
            pr.close();
        }

    }
}
