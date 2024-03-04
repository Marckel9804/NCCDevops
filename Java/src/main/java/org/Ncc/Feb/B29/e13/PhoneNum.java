package org.Ncc.Feb.B29.e13;

public class PhoneNum {
    String name;
    String phone;

    PhoneNum(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void show() {
        System.out.println("이름 : " + name);
        System.out.println("번호 : " + phone);
    }
}
