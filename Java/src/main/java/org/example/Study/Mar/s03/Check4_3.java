package org.example.Study.Mar.s03;

public class Check4_3 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<101; i++) {
            if(i%3==0) {
                sum+=i;
            }
        }

        System.out.println("1~100의 3의 배수 총합 : " + sum);
    }
}
