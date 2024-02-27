package org.example.Ncc.Feb.B26;

class Student2{
    String name, id;

    Student2(String name, String id ){
        this.name = name;
        this.id = id;
    }
    void pr(){
        System.out.println(name+""+id);
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Student2 s1=new Student2("김길동", "kim");
        Student2 s2=new Student2("이길동", "lee");

        s1.pr();
        s2.pr(); //모든 데이터 출력
    }
}
