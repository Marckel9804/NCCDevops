package org.Ncc.Mar.t07.Quiz.quiz67;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Sol6 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc= new Scanner(System.in);

        for (int i=0; i<3; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            map.put(name, age);
        }
        Set<String> s = map.keySet();
        Iterator<String> it = s.iterator();

        int max = -1000;
        String str = "";

        while (it.hasNext()){
            String name = it.next();
            int age = map.get(name);

            if(age>max) {
                max = age;
                str = name;
            }
        }

        System.out.println(str);
    }
}
