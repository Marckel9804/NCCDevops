package org.Ncc.Mar.t07.Quiz.quiz67;

import org.Ncc.Mar.t06.generic.exam02.St;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<String, Integer>();

        Scanner sc = new Scanner(System.in);
        String max="";
        int maxi=-1;
        for (int i =0; i<3; i++){
            h.put(sc.next(),sc.nextInt());
        }

        Iterator<String> it = h.keySet().iterator();
        while (it.hasNext()){
            String k = it.next();
            if(h.get(k)>maxi){
                maxi = h.get(k);
                max = k;
            }
        }
        System.out.println(max);
    }
}
