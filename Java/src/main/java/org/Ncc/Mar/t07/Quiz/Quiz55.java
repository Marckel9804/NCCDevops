package org.Ncc.Mar.t07.Quiz;

import java.util.HashMap;
import java.util.Map;

public class Quiz55 {
    public static void main(String[] args) {
        Map<String, Integer> p = new HashMap<>();

        p.put("서창호", 25);
        p.put("홍창홍", 26);
        p.put("김창호", 27);

        System.out.println(p.get("서창호"));
    }
}
