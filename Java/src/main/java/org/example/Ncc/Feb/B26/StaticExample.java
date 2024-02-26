package org.example.Ncc.Feb.B26;

//static 메소드는 클래스 내부에서 객체 선언 없이 바로 사용가능하다.
public class StaticExample {
    public static void main(String[] args) {
        int a,b;
        System.out.println(cal(a=1,b=3));
    }

    public static int cal(int a, int b){
        return a+b;
    }
    
}
