package org.Ncc.Mar.t12.Review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, String> h = new HashMap<String, String>();

        h.put("aa", "123");
        h.put("bb", "1234");
        h.put("cc", "12345");

        Set<String> keys = h.keySet();
        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
            System.out.println(h.get(str));
        }
    }
}
