package org.Ncc.Feb.B29.e14;

public class Add implements Addin{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int add(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum+=i;
        }
        return sum;
    }

    @Override
    public void pr() {
        System.out.println("머시 중헌디");
    }
}
