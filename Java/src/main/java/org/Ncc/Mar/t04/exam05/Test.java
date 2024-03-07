package org.Ncc.Mar.t04.exam05;


public class Test {
    static void show (Person person) {
        System.out.println(person.work());
    }
    public static void main(String[] args) {
        show(new Worker());
        show(new Student());
    }
}