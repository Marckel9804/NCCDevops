package org.Ncc.Mar.t08.quiz;

import java.io.*;

public class Sol3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Changho\\Desktop\\fi.txt");
        ByteArrayInputStream bais = null;

        byte b[] = {1,2,3,4,5};
        try {
            for (int i = 0; i <b.length; i++) {
                fos.write(b[i]);
            }

        } catch (Exception e){
            fos.close();
            bais.close();
        }

        FileInputStream fis = new FileInputStream("C:\\Users\\Changho\\Desktop\\fi.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] arr ;
        try {
            int r = -1;
            while ((r = fis.read())!=-1){
                baos.write(r);
            }
            byte[] t = baos.toByteArray();
            for(byte k : t){
                System.out.println(k);
            }
        } catch (Exception e){baos.close();fis.close();}
    }
}
