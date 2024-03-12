package org.Ncc.Mar.t12.Review;


public class WrapperMethod {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("25"));
        System.out.println(Integer.valueOf("25"));

        System.out.println(Integer.toString(25));

        //기본 정수값인 10을 정수형 객체로 변환 -> 박식//
        Integer i = Integer.valueOf(10);

        //정수형 객체를 기본 정수값으로 변환 ->
        System.out.println(i.intValue());
    }
}
