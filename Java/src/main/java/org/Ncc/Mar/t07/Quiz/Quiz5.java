package org.Ncc.Mar.t07.Quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Quiz5 {
    //ctrl shift o
    public static void main(String[] args) {

        Set<Person> s=new HashSet<Person>();

        s.add(new Person(12, "홍길동"));
        s.add(new Person(23, "김길동"));
        s.add(new Person(12, "이길동"));

        Iterator<Person> it=s.iterator();

        while(it.hasNext()){
            Person p=it.next();
            System.out.println(p.num + " " + p.name);
        }
    }
}
