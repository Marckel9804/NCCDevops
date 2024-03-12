package org.Ncc.Mar.t12.Review;

//자식 클래스
class I extends K{
    int n;
    I(int n) {
        //부모 클래스 생성자 호출
        super(n);
        this.n = n;
    }
}
class K{
    K(){
        System.out.println("기본 생성자 K");
    }
    K(int a){
        System.out.println("매개변수 한개 생성자 K : " + a);
    }
}
public class Ex02 {
    public static void main(String[] args) {
        I b = new I(10);

    }
}
