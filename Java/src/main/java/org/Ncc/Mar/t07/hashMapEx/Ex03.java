package org.Ncc.Mar.t07.hashMapEx;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<>();

        h.put("서창호", "25");
        h.put("김창호", "26");
        h.put("kekekek", "120");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("id, pw 입력: ");
            String id = sc.next();
            String pw = sc.next();
            if(!h.containsKey(id)) {    //id가 해시맵에 없을경우
                System.out.println("id가 존재하지 않음");
                continue;
            }
            if (h.get(id).equals(pw)){
                System.out.println(id + " " + pw);
            } else {
                System.out.println("비번 불일치");
            }
        }

    }
}
