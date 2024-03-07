package org.Ncc.Mar.t06.arrayListEx.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Profile> a = new ArrayList<Profile>();
        //arraylist에다 값 세개 삽입 임의값으로 설정

        a.add(new Profile("seo",25));
        a.add(new Profile("kim", 34));
        a.add(new Profile("park", 26));

        System.out.println(a.get(2).id + a.get(2).age);

    }
}
