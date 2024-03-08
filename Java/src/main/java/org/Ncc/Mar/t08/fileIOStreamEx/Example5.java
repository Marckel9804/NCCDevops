package org.Ncc.Mar.t08.fileIOStreamEx;

import java.io.FileReader;
import java.io.IOException;

public class Example5 {
    public static void main(String[] args) throws IOException {
        //a.txt에 저장된 문자를 읽어와서 출력
        char[] arr = new char[10];
        int r;

        FileReader in = new FileReader("C:\\Users\\Changho\\Desktop\\a.txt");
        //파일에ㅔ 저장한 문자를 읽어들어서
        r=in.read(arr,0,arr.length);
        //배열의 길이만큼 저장
        for (int i = 0; i < r; i++) {
            System.out.println(arr[i]);
        }

        in.close();
    }
}
