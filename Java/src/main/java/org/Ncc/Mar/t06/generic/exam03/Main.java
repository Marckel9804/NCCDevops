package org.Ncc.Mar.t06.generic.exam03;

public class Main {
    static void pr(Fo<? extends Food> f){
        Food fo = f.out();
        fo.show();
    }
    public static void main(String[] args) {
        Fo<Food> f = new Fo<Food>();
        f.in(new Food());
        pr(f);

        Fo<Pizza> p = new Fo<Pizza>();
        p.in(new Pizza());
        pr(p);
    }
}
