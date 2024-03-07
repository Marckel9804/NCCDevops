package org.Study.Mar.s07;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountSamePer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> cnt = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int k = sc.nextInt();
            cnt.add(k%42);
        }
        System.out.println(cnt.size());
    }
}
