package org.Ncc.Mar.t12.Review;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileWriteEx {
    public static void main(String[] args) {
        byte[] bb = {4,2,4,1,3,6};

        try {
            FileWriter fw = new FileWriter("SmapleFile/temp.txt");
            for (int i=0;i<bb.length; i++) {
                fw.write(bb[i]);
            }
            fw.write(Arrays.toString(bb));
        } catch (IOException e) {
        }
    }
}
