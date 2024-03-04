package org.Ncc.Feb.B27;

class Circle2{
    //인스턴스 변수(클래스 따라 default)
    int n;
    String name;

    Circle2(){      //default 생성자 - 기본 생성자
        n=3;
        name="원";
        //this(3,"원"); -> 다른 생성자 호출
    }
    Circle2(int n){     //default 생성자 - 매개변수 존재
        this.n=n;
    }
    Circle2(int n, String name){        //default 생성자 - 매개변수 2개
        this.n = n;
        this.name = name;
    }

    void hh(){
        System.out.println();
    }

}
public class CircleEx {
    public static void main(String[] args) {
        Circle2 c =new Circle2();   //다른 매개변수 생성자가 있으므로 기본 생성자를 만들어줘야함
        Circle2 c2 = new Circle2(5);
        Circle2 c3 = new Circle2(4, "aa");

        c.hh();

    }
}
