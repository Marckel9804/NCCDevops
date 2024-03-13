package org.Ncc.Mar.t12.Review;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOStreamEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n==-1){
                break;
            }
            System.out.println(n);
        }

        FileWriter fw = null;
        int r=-1;
        try {
            fw = new FileWriter("SampleFile/fwEx.txt");
            while ((r=br.read())!=-1){
                fw.write(r);
            }
            fw.close();
            br.close();
        } catch (Exception e) {}
    }
}
