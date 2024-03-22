package org.Ncc.Mar.t22;

public class User {
    private String userid;
    private String username;
    private String password;
    private int age;
    private  String email;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.userid + " " + this.username + " " + this.password + " " + this.age + " " + this.email;
    }
}

//테이블에서 users 정보를 가져오고 출력하고 싶음
