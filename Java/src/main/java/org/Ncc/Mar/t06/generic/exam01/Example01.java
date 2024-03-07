package org.Ncc.Mar.t06.generic.exam01;

class Program<T>{ //모형자 < > : 제네릭
    T t;
    void in(T t) {
        this.t=t;
    }
    T get() {
        return t;
    }
}
class Java{
    String s;
    Java(String s){
        this.s=s;
    }
    void show() {
        System.out.println(s);
    }
}
class DB{
    String s;
    DB(String s){
        this.s=s;
    }
    void show() {
        System.out.println(s);
    }
}
public class Example01 {
    public static void main(String[] args) {

        Program<Java> p = new Program<Java>();
        p.in(new Java("java"));
        Java j=p.get();
        j.show();

        Program<DB> p2 = new Program<DB>();
        p2.in(new DB("db"));
        DB j2=p2.get();
        j2.show();

    }
}
