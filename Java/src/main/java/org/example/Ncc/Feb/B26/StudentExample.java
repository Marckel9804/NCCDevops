package org.example.Ncc.Feb.B26;

class Student{
    String name;
    String last_name;

    Student(String name, String last_name){
        this.name = name;
        this.last_name = last_name;
    }

    void pr(){
        System.out.println(name + " " + last_name);
    }
}
public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student("김길동","kim");
        Student s2 = new Student("이길도","lee");

        s1.pr();
        s2.pr();
    }
}
