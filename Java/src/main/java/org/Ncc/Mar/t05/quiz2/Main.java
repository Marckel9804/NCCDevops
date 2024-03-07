package org.Ncc.Mar.t05.quiz2;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("1+2+3+4+5","+");

        int sum=0;
        while (st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println("총합 = " + sum);
    }
}
