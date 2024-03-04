package org.Ncc.Feb.B29.Q1;

public class Friend {
    private String name;
    private String phone;

    Friend(String name, String phone){
        this.name=name; this.phone=phone;
    }

    String get() {
        return name + " " + phone;
    }
}
