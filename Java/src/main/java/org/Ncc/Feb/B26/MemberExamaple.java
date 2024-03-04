package org.Ncc.Feb.B26;

class Member{

    private String name;
    private String id;
    private String password;
    private int age;

    Member(){}
    Member(String name, String id){
        this.name = name;
        this.id = id;
    }
    Member(String name, String id, String password, int age){
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }
    void show(){
        System.out.println(name + " "+id+" "+password+" "+age);
    }

    boolean login(String id,String password){
        return (id.equals(this.id)) && (password.equals(this.password));
    }
    void logout(String id){
        System.out.println(id+"님이 로그아웃 되었습니다.");
    }
}
public class MemberExamaple {
    public static void main(String[] args) {
        Member user1 = new Member("김길동","kim");
        user1.show();

        Member user2 = new Member("홍길동", "hong","12345",25);
        boolean result = user2.login("hong","12345");
        if (result){
            System.out.println("로그인 되었습니다");
            user2.logout("hong");
        }
        else{
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
