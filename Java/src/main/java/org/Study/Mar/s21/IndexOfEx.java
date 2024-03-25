package org.Study.Mar.s21;

import java.util.Arrays;

public class IndexOfEx {
    public static void main(String[] args) {
        String str1 = "머쓱이는 머쓱 머쓱 해요";
        String str2 = "머쓱";
        String str3 = "dldldl";
        int[] arr = new int[5];
        str1.length();
        int k = arr.length;
        Arrays.sort(arr);
        System.out.println(str1.indexOf(str2));
        System.out.println(str2.indexOf(str3));
        String[] strarr = new String[102];
        int t = strarr.length;

        int[]numbers = {1,2,3,5,2,3,21,2};
        int[] answer = {};
        answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
    }
}
