package org.Test.q9;

abstract class A {
    protected int v;
    protected A(int v){
        this.v = v;
    }
}
class B extends A {
    public B(int v) {
        super(v);
    }
}
class C extends A {
    public C(int v) {
        super(v);
    }
}
class D extends A {
    public D(int v) {
        super(v);
    }
}
public class Test9 {
    public static void main(String[] args) {
        //(1)
        //A a1 = new A();
        //A는 abstract 클래스라 객체 생성이 안된다.
        //A a2 = new B();
        //B는 부모클래스A를 따라서 파라미터를 가진 생성자만 존재한다.
        //그러므로 A a2 = new B(20); 같은 형식이 옳다
        //B a5 = new D(30);
        //protect 변수도 영향은 있지만 B 와 D는 A를 부모클래스로 가지지만
        //B가 D의 관계가 상하관계가 없으므로 객체 생성이 불가능하다.
    }
}
