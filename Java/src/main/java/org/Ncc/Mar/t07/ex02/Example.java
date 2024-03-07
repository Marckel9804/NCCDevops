package org.Ncc.Mar.t07.ex02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example {


    public static void main(String[] args) {
        Map<Integer, Double> m = new HashMap<Integer, Double>();
        m.put(12, 12.3);
        m.put(13, 13.2);
        m.put(10, 10.2);

        Set<Map.Entry<Integer, Double>> s = m.entrySet(); //p.656

        for (Map.Entry<Integer, Double> m1 : s) {
            System.out.println(m1.getKey());
            System.out.println(m1.getValue());
        }

    }
}
