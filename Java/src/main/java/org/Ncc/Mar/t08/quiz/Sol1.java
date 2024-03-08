package org.Ncc.Mar.t08.quiz;

import java.io.*;

public class Sol1 {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream in = null;
        FileOutputStream out = null;

        try {
            byte [] b= new byte[] {4,6,7,8,-1,24};
            out = new FileOutputStream("C:\\Users\\Changho\\Desktop\\test.txt");

            for (int i = 0; i <b.length; i++) {
                out.write(b[i]);
            }

        } catch (Exception e){
            out.close();
            in.close();
        }
        FileInputStream ins = null;
        ByteArrayOutputStream outs = null;

        try {
            ins = new FileInputStream("C:\\Users\\Changho\\Desktop\\g.dat");
            outs = new ByteArrayOutputStream();

            int r = -1;
            while ((r = in.read())!=-1){
                outs.write(r);
            }
            byte[] t = outs.toByteArray();
            for(byte k : t){
                System.out.println(k);
            }
        } catch (Exception e){outs.close();ins.close();}
    }
}
