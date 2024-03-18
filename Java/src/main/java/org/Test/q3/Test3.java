package org.Test.q3;

class Number{
    int sum=0;
    int max=-100000;
    Number(){
        this.sum = 0;
        this.max = 0;
    }
    Number(int n){
        this.sum = n;
        this.max = n;
    }

    void addin(int n){
        sum+=n;
        if(max<n){
            max=n;
        }
    }
    int getSum(){
        return sum;
    }
    int getMax() {
        return max;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Number nb = new Number ();
        nb.addin(7); nb.addin(-1); nb.addin(20); nb.addin(5); // 4 개 숫자를 입력
        System.out.println("Sum = " + nb.getSum()); // 4 개 숫자의 합계
        System.out.println("Max = " + nb.getMax()); // 4 개 숫자 중 최대값

        Number nb2 = new Number ();
        nb2.addin(7); nb2.addin(-1); nb2.addin(20); nb2.addin(5); // 4 개 숫자를 입력
        System.out.println("Sum = " + nb2.getSum()); // 4 개 숫자의 합계
        System.out.println("Max = " + nb2.getMax()); // 4 개 숫자 중 최대값

        Number nb3 = new Number (10);
        nb3.addin(7); nb3.addin(-1); nb3.addin(20); nb3.addin(5); // 4 개 숫자를 입력
        System.out.println("Sum = " + nb3.getSum()); // 4 개 숫자의 합계
        System.out.println("Max = " + nb3.getMax()); // 4 개 숫자 중 최대값
    }
}
