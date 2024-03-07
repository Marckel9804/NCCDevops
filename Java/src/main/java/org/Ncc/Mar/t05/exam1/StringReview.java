package org.Ncc.Mar.t05.exam1;

public class StringReview {
    public static void main(String[] args) {
        String str = "Java";
        String str2 = "C++";

        int r = str.compareTo(str2);

        if(r==0) {
            System.out.println("같다.");
        } else if (r<0) {
            System.out.println("Java가 사전상 C++보다 크다");
        } else {
            System.out.println("Java가 사전상 C++보다 작다");
        }
    }
}
