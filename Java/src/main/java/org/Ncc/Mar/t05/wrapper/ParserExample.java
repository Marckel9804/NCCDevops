package org.Ncc.Mar.t05.wrapper;

public class ParserExample {
    public static void main(String[] args) {
        //문자열을 기본 타입으로 변환!!
        int i2 = Integer.parseInt("123");
        int sum = 22 + i2;
        System.out.println(sum);
        boolean b = Boolean.parseBoolean("true");
        double d = Double.parseDouble("3.14");
        //parse~ 반환형이 기본자료형


        int i3 = Integer.valueOf(123);
        int i4 = Integer.valueOf("10")+ Integer.valueOf("20");
        int i5 = Integer.valueOf("201", 10);
        System.out.println(i5);

        //valueOf는 반환형이 객체

        String a = Integer.toString(1123);
        //정수형 객체 1123을 객체로 변환

        Integer i6 = 100;   //auto boxing
        int n1 = i6+100;    //auto unboxing
        System.out.println(n1);

    }
}
