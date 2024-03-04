package org.Ncc.Mar.t04.quiz6_2;

public class Cd implements Ab{
    @Override
    public int total(int[] arr) {
        int sum=0;
        for (int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
