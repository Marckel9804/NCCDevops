package org.Ncc.Mar.t08.quiz;

import java.io.*;
import java.util.StringTokenizer;

public class Sol2 {
    public static void main(String[] args) throws IOException {
        FileWriter fos = new FileWriter("C:\\Users\\Changho\\Desktop\\Sample.txt");
        BufferedWriter bw = new BufferedWriter(fos);

        bw.write("저는 자바를 좋아합니다.");
        bw.close();

        FileReader fr = new FileReader("C:\\Users\\Changho\\Desktop\\Sample.txt");
        BufferedReader br = new BufferedReader(fr);
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String[] arr = new String[3];
        for (int i = 0; i < 3; i++) {
            arr[i]=st.nextToken();
        }
        for (int i = 0; i <3; i++) {
            System.out.println(arr[i]);
        }
    }
}
