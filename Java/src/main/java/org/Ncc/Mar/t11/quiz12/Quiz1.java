package org.Ncc.Mar.t11.quiz12;

import java.io.*;

public class Quiz1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("SampleFile/test01.txt" );

        String[] str = {"Hi","저는 자바를 좋아하고 잘합니다.","앞으로 더 열심히 공부할 것입니다."};
        DataOutputStream dos = new DataOutputStream(fos);
        for (int i = 0; i < 3; i++) {
            dos.writeUTF(str[i]+"\n");
        }


    }
}
