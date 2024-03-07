package org.Study.Mar.s07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        HashSet<Integer> log = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 31; i++) {
            log.add(i);
        }

        for (int i = 0; i < 28; i++) {
            int k = sc.nextInt();
            log.remove(k);
        }

        Iterator<Integer> ss = log.iterator();

        while (ss.hasNext()){
            System.out.println(ss.next());
        }
    }
}
