package org.Ncc.Mar.t04.exam03;

public class Calcu implements Cal {
    @Override
    public int total(int a, int b) {
        int sum=0;
        for (int i=a; i<=b; i++){
            sum+=i;
        }
        return sum;
    }

    @Override
    public int big(int a, int b) {
        return a>b?a:b;
    }
}
