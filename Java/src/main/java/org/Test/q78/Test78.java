package org.Test.q78;

public class Test78 {
    static int sum(int[] arr){
        int sumi=0;
        for (int i=0; i<arr.length; i++){
            sumi+=arr[i];
        }
        return sumi;
    }
    static String join(String[] arr){
        String str="";
        for (int i=0; i<arr.length; i++){
            str+=arr[i];
        }
        return str;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        String[] arr2 = {"A","B","C","D"};
        int sum  = sum(arr1);
        System.out.println("sum=" + sum);
        String join = join(arr2);
        System.out.println("join=" + join);
    }
}
