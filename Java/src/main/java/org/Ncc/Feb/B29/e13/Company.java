package org.Ncc.Feb.B29.e13;

public class Company extends PhoneNum{
    String grade;

    Company(String name, String phone, String grade) {
        super(name, phone);
        this.grade = grade;
    }

    @Override
    void show() {
        super.show();
        System.out.println("직급 : " + grade);
    }
}
