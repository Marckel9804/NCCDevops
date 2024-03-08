package org.Ncc.Mar.t08.fileIOStreamEx;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        //파일에 저장된 바이트 배열을 읽어와서 출력
        FileInputStream in = null;
        ByteArrayOutputStream out = null;

        try {
            in = new FileInputStream("C:\\Users\\Changho\\Desktop\\g.dat");
            //g.data 파일을 읽어서
            out = new ByteArrayOutputStream();
            //바이트 배열에 저장한다.

            int r = -1;
            while ((r = in.read())!=-1){
                out.write(r);   //배열에 저장된 1,2,3
            }
            byte[] t = out.toByteArray();
            for(byte k : t){
                System.out.println(k);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
