package org.Study.Mar.s06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class APlusB4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> sum = new ArrayList<Integer>();

        while (true){
            try {
                String str = br.readLine();
                if(str ==null || str.isEmpty()){
                    break;
                }
                StringTokenizer st = new StringTokenizer(str);
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                sum.add(a+b);
            } catch (Exception e) {
                break;
            }
        }
        for (int i = 0; i < sum.size(); i++) {
            System.out.println(sum.get(i));
        }
    }
}
