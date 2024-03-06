package org.Ncc.Mar.t06.generic.exam02;

public class St<T>{
    int n;
    Object[] st;

    St() {
        st = new Object[3];
        n=0;
    }

    public void push(T t ){
        if(n>=3) {
            System.out.println("Stack Overflow");
            return;
        }
        st[n] = t;
        n++;
    }
    public T pop() {
        if(n==0) {
            System.out.println("Stack UnderFlow");
            return null;
        }
        n--;
        return (T)st[n];
    }
}
