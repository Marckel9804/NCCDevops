package org.Ncc.Mar.t04.exception.ex03;

public class Calc {
    public int calculate(int n) {
        //1부터 n까지 홀수만 더한 총합
        int sum=0;
        for (int i = 1; i < n; i++) {
            if(i%2 ==1 ){
                sum+=i;
            }
        }
        return sum;
    }
}
