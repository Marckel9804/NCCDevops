package org.Ncc.Mar.t07.hashMapEx;

import java.util.HashMap;

public class Ex01 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "kiti");
        hm.put(2, "dogi");

        //p656
        System.out.println(hm.get(1));  //키값 1인 벨류찾기
        System.out.println(hm.get(2));
    }
}
