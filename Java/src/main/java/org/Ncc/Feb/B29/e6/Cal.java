package org.Ncc.Feb.B29.e6;

public class Cal extends Ca{
    @Override
    int add(int a, int b) {
        return a+b;
    }

    @Override
    double avg(int[] a) {
        int sum = 0;

        for (int i : a){
            sum += i;
        }
        return (double)sum/a.length;
    }
}
