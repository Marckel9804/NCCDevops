package org.Ncc.Mar.t11.objectIOEx;

import java.io.*;

public class Example2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = null;
        oos = new ObjectOutputStream(new FileOutputStream("SampleFile/obj.dat"));

        //Rec r = new Rec(4,8);
        oos.writeObject(new Rec(4,7));
        oos.writeObject(new Rec(8,5));
        oos.writeObject(new String("glgl"));

        oos.close();

        ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("SampleFile/obj.dat"));

        Rec r1 = (Rec)ois.readObject();
        r1.show();
        Rec r2= (Rec) ois.readObject();
        r2.show();
        String str = (String)ois.readObject();
        System.out.println(str);
    }
}
