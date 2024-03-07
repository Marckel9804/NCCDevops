package org.Ncc.Mar.t05.hashset.stringClass;

import java.util.StringTokenizer;

public class StringEx {
    public static void main(String[] args) {
        String str = "id=123#name=gildong#addr=seoul";
        // #을 기준으로 문자열 나누기

        StringTokenizer s = new  StringTokenizer(str,"#");
        int n = s.countTokens();
        System.out.println(n);
        while (s.hasMoreTokens()) {
            String a = s.nextToken();
            StringTokenizer s2 = new  StringTokenizer(a,"=");
            System.out.println(a);
            System.out.println(s2.nextToken());
            System.out.println(s2.nextToken());
        }
    }
}
