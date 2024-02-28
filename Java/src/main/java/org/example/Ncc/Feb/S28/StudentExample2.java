package org.example.Ncc.Feb.S28;

public class StudentExample2 {
    public static void main(String[] args) {

        Student2 st = new Student2("홍길동");

        Person2 p = new Person2("김길동");

        Person2 p2 = new Student2("길동"); //outcasting 자동형변환

        Student2 s2 = (Student2) p2; //downcasting -> 강제 형 변환

        System.out.println(s2.name);
    }
}
