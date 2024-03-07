package org.Ncc.Mar.t07.ex01;

public class Gen <T>{
    T t1,t2;
    Gen(T t1, T t2){
        this.t1 = t1;
        this.t2 = t2;
    }
    T one() {
        return t1;
    }
    T two() {
        return t2;
    }
    boolean three() {
        return t1.equals(t2);
    }
}
