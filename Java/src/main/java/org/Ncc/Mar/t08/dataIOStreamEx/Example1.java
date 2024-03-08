package org.Ncc.Mar.t08.dataIOStreamEx;

import java.io.*;

public class Example1 {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos= null;
        //기본자료형 값을 저장할 수 있다.
        try {
            int a = 5;
            double b = 1.5;
            boolean c = true;

            FileOutputStream fos = new FileOutputStream("h.txt");
            dos = new DataOutputStream(fos);

            dos.writeInt(a);
            dos.writeDouble(b);
            dos.writeBoolean(c);

        } catch (Exception e) {
            dos.close();
        }

        FileInputStream fis = new FileInputStream("h.txt");
        DataInputStream dis = new DataInputStream(fis);

        try {
            int a = dis.readInt();
            double b= dis.readDouble();
            boolean c = dis.readBoolean();
            System.out.println(a + " " + b + " " + c);
        } catch (Exception e) {
            dis.close();
        }
    }
}
