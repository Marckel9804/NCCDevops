package org.example.Ncc.Feb.B28;

public class InstanceExample {
    static void pr(Fruit2 f){
        if(f instanceof PineApple2){
            ((PineApple2) f).pineapple();
        } else if(f instanceof Apple2){
            ((Apple2) f).apple();
        } else {
            f.fruit();

        }
    }
    public static void main(String[] args) {
        Fruit2 f = new Fruit2();
        Apple2 a = new Apple2();
        PineApple2 p = new PineApple2();

        pr(f);
        pr(a);
        pr(p);
    }
}
