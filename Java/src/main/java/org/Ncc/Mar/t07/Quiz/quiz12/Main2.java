package org.Ncc.Mar.t07.Quiz.quiz12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"one");
        map.put(2,"two");
        map.put(3, "three");

        Iterator<Integer> it = map.keySet().iterator();

        while (it.hasNext()) {
            int i = it.next();
            String str = map.get(i);
            System.out.println(i+ " "+ str);
        }

        Scanner sc= new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            System.out.println(map.get(n));
        }
    }
}
