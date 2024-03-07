package org.Ncc.Mar.t07.Quiz.quiz12;

import java.util.ArrayList;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("one");
        arr.add("two");
        arr.add("three");

        Iterator<String> it = arr.iterator();
        while (it.hasNext()){
            String str = it.next();
            if(str.compareTo("three")==0){
                it.remove();
            }
        }
        System.out.println(arr);
    }
}
