package org.Book.ch13.sec03.exam01;

public class Box<T>{
    //필드
    private T t;

    //Getter 메소드;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
