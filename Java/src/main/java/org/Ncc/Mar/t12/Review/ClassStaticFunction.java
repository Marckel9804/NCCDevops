package org.Ncc.Mar.t12.Review;

class Print {
    static int max(int a, int b) {
        return a>b?a:b;
    }
}
public class ClassStaticFunction {
    public static void main(String[] args) {
        System.out.println(Print.max(2,4));
    }
}
