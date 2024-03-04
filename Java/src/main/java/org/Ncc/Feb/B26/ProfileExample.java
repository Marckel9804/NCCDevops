package org.Ncc.Feb.B26;

class Profile{
    //field
    int age; //0
    String name; //null

    //메소드
    void show(){
        System.out.println(age+ "세 " + name);
    }
}
public class ProfileExample {
    public static void main(String[] args) {
        Profile profile = new Profile(); //객체명:p, 생성자 호출:new Profile()

        profile.age = 27;
        profile.name = "서창호";

        profile.show();
    }
}
