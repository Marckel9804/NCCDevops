package org.Ncc.Mar.t12.Review;

abstract class  Calcu {
    abstract int add(int x, int y);
    abstract int div(int x, int y);
}

class Cal extends Calcu{
    @Override
    int add(int x, int y) {
        return x+y;
    }

    @Override
    int div(int x, int y) {
        return x/y;
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Calcu c = new Cal();
        System.out.println(c.add(2,5) + " " + c.div(29,4));
    }
}
