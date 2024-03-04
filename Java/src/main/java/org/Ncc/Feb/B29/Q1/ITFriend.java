package org.Ncc.Feb.B29.Q1;

public class ITFriend extends Friend{
    String str;

    ITFriend (String name, String phone, String str) {
        super(name, phone);
        this.str = str;
    }

    void show() {
        System.out.println(str + " " +super.get());
    }
}
