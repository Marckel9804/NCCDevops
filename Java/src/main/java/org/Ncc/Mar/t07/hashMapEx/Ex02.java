package org.Ncc.Mar.t07.hashMapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("물", "water");
        hm.put("커피", "coffee");
        hm.put("티", "tea");

        Set<String> keys = hm.keySet(); //p.656

        Iterator<String> it = keys.iterator();  //키 반복자를 이용해서 키값들 호출
        while (it.hasNext()){
            String a = it.next();

        }
    }
}
