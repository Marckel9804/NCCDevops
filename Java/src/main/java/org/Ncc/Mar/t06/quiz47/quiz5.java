package org.Ncc.Mar.t06.quiz47;

public class quiz5 {
    public static int add(int[] a, int n){
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=a[i];
        }
        return sum;
    }
    public static int add(int[] a, int n, int[] b){
        int sum=0;
        for (int i = 0; i <n; i++) {
            sum+=a[i]+b[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int c=add(a,5);
        int d=add(a,5,b);

        System.out.println(c);
        System.out.println(d);
    }
}
