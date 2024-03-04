package org.example.Ncc.Feb.B29.e3;

public class Number {
    static void show(int n) {
        System.out.println(n);
    } // 함수명이 같을때

    void show(double n) { // 매개변수 타입 || 매개변수 개수가 다르면 상관없음=>오버로딩
        System.out.println(n);
    }
}
