package org.Test.q10;

//A
public class Worker {
    //B
    private int number;
    private String name;
    private String dept;
    private String address;
    private String birth;

    //D
    Worker(int number, String name, String dept, String address, String birth){
        this.number = number;
        this.name = name;
        this.dept = dept;
        this.address = address;
        this.birth = birth;
    }

    //E
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    //F
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getAddress() {
        return address;
    }

    public String getBirth() {
        return birth;
    }

}
