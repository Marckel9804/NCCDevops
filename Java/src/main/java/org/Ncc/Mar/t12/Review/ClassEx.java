package org.Ncc.Mar.t12.Review;

class A {
    int a,b;
    //생성자 -> 필드값 초기화 위주로 사용됨
    //기본생성자
    A() {}
    //매개변수가 있는 생성자
    A(int a, int b){
        this.a = a;
        this.b = b;
    }
    //this 키워드로 활용해서 클래스 내부의 생성자 사용
    //해당 파라미터가 일치하는 생성자로 넘어감
    A(int a) {
        this(a,5);
    }

    double area() {
        return a*b;
    }
}
public class ClassEx {
    public static void main(String[] args) {
        A a = new A();  //기본 생성자로 객체생성
        a.a = 3;
        a.b = 4;
        System.out.println(a.area());

        A b = new A(12,3);  //매개변수가 있는 생성자로 객체 생성
        System.out.println(b.area());

        A c = new A(7);
        System.out.println(c.area());
    }
}
