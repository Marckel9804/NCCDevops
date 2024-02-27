package org.example.Study.Feb.S26;

import java.io.*;
import java.util.StringTokenizer;

public class FastAplusB {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] sum = new int[n];

        for (int i=0; i<n; i++){
            String s= bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a =Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum[i]=a+b;
        }

        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=0; i<n; i++){
            bw.write(sum[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
