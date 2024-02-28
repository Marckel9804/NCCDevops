package org.example.Ncc.Feb.B27;

class St{
    int n ;
    void f1( int x){
        n = x;
    }
    static int m;

//    static void f2(int x){
//        n = x;
//    }

    static void f3(int x) {
        m =x;
    }
}
public class StExample {
    public static void main(String[] args) {
        //St.m = new St();
        //St.n=3; //인스턴스 멤버이기 때문에 객체 만들고 접근해야함
        St.m=3; //정적멤버는 클래스명으로부터 바로 접근가능(객체 생성 필요없음)
    }
}
