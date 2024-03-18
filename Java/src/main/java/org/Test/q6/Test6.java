package org.Test.q6;

public class Test6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1024; i *= 4) {
            System.out.println(i);
        }
        int i=1;
        while (i<=1024){
            System.out.println(i);
            i*=4;
        }
    }
}
