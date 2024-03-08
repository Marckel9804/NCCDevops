package org.Ncc.Mar.t08.fileIOStreamEx;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) throws IOException {
        //1,2,3,4,5를 읽어와서 outputstream에 자장하고 싶다.
        byte[] in = {1,2,3,4,5};
        byte[] out = null;

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        output = new ByteArrayOutputStream();
        input = new ByteArrayInputStream(in);   //바이트 배열 읽어옴

        int r = -1;
        while ((r = input.read())!=-1){
            output.write(r); //스트림에 저장
        }
        out = output.toByteArray(); //byte[] b = out.toByteArray();
        //바이트 스트림을 바이트 배열로 바꿔서 out(바이트 배열)
        System.out.println(Arrays.toString(in));
        System.out.println(Arrays.toString(out));
    }
}
