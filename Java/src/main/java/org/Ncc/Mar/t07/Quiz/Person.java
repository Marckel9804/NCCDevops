package org.Ncc.Mar.t07.Quiz;

import java.util.Objects;

public class Person {
    int num;
    String name;
    Person(int num, String name){
        this.num = num;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return num == person.num ;
    }
}