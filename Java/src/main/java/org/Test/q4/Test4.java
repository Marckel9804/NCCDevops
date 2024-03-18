package org.Test.q4;

import java.io.*;

class Student implements Serializable{
    String name;
    String id;
    int age;

    Student(String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    void show(){
        System.out.println(name + " " + id + " " + age);
    }
}

public class Test4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s= new Student("jack","123",20);

        FileOutputStream fos = new FileOutputStream("java.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);

        FileInputStream fis = new FileInputStream("java.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s = (Student)ois.readObject();

        s.show(); //모든 데이터 출력

        ois.close();
        fis.close();
        oos.close();
        fos.close();
    }
}
