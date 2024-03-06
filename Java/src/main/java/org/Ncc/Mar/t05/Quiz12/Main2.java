package org.Ncc.Mar.t05.Quiz12;

public class Main2 {
    public static void main(String[] args) {
        Circle a=new Circle(30);
        Circle b=new Circle(30);

        System.out.println("반지름"+a);
        System.out.println("반지름"+b);

        if(a.equals(b)) {
            System.out.println("같은 원");
        } else {
            System.out.println("다른 원");
        }
    }
}
