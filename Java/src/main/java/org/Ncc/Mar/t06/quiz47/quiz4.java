package org.Ncc.Mar.t06.quiz47;


public class quiz4 {
    public static int[] make() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ary;
        ary = make();
        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i] + " ");
        }
    }
}
