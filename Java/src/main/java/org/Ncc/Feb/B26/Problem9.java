package org.Ncc.Feb.B26;

public class Problem9 {
    public static void main(String[] args) {
        String str = "공부는 어렵지만, 재밌네요";
        String[] arr = str.split(",");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(str.charAt(6));
        System.out.println(str.substring(0,3));
    }
}
