package org.example.Ncc.Feb.B27;

public class Quiz4 {
    static void show(int[] arr){
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] ary = {6,2,8,4,9};
        show(ary);
    }
}
