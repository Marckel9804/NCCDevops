package org.example.Ncc.Feb.S28;

//부모 클래스 = 슈퍼 클래스 = 상위 클래스
public class Student extends Person{
    private String major;
    private String school;

    //자식 클래스의 생성자 = 서브 클래스 = 하위 클래스
    Student(String name, String major, String school) {
        super(name); //부모 생성자 호출
        this.major = major;
        this.school = school;
    }

    void show() {
        name();     //부모에 있는 sout(name) 호출
        System.out.println(major);
        System.out.println(school);
    }
}
