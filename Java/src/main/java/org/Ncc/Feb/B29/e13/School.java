package org.Ncc.Feb.B29.e13;

public class School extends PhoneNum{
    String major;

    School (String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }

    @Override
    void show() {
        super.show();
        System.out.println("전공 : " + major);
    }
}
