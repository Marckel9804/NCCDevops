package org.example.Ncc.Feb.B28;

public class StudentExample {
    public static void main(String[] args) {
        Person person = new Person("홍길동");
        Student student = new Student("김길동", "박사", "비트대학");

        person.name();
        student.name();
        student.show();
    }
}
