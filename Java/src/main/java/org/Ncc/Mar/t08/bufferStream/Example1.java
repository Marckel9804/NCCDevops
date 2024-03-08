package org.Ncc.Mar.t08.bufferStream;

import java.io.*;

public class Example1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Changho\\Desktop\\tt.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("안녕");
        bw.newLine();
        bw.write("오늘은 금요일");
        bw.newLine();
        bw.write("ㅁㅁㅁ@ㅁㄴㅇㄻㅁㄴㅇㄹ");
        bw.close();
    }
}
