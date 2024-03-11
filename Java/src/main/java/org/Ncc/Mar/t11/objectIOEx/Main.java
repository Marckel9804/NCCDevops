package org.Ncc.Mar.t11.objectIOEx;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream("SampleFile/ob.dat")
            );

            Stu s = new Stu();
            s.setName("서창호");
            s.setId("1234");
            s.setAge(26);

            oos.writeObject(s); //직렬화
        } catch (Exception e) {}
        oos.close();
        ObjectInputStream in =null;
        try {
            in = new ObjectInputStream(new FileInputStream("SampleFile/ob.dat"));
            Stu s= (Stu) in.readObject();   //형변환

            System.out.println(s.getName());
            System.out.println(s.getId());
            System.out.println(s.getAge());
        } catch (Exception e) {}
        in.close();
    }
}
