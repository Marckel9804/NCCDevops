package org.Ncc.Mar.t08.fileIOStreamEx;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream in = null;
        FileOutputStream out = null;

        try {
            byte [] b= new byte[] {1,2,3};
            in = new ByteArrayInputStream(b);
            out = new FileOutputStream("C:\\Users\\Changho\\Desktop\\g.dat");

            int r = -1;
            while ((r=in.read())!=-1) {
                out.write(r);
            }
        } catch (Exception e){
            out.close();
            in.close();
            System.out.println("존재하지 않는 디렉토리입니다.");
        }
    }
}
