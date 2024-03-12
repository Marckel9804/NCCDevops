package org.Ncc.Mar.t12.Review;

public class PrintArray {
    static  int[] pr() {
        int[] arr= {1,2,3,4,5};
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = pr();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}