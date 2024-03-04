package org.example.Ncc.Feb.B29.e11;

public class Test {
    public static void main(String[] args) {
        Num[] arr = new Num[] { new Num(1), //객체 생성 코드(값 초기화)
                new Num(2),
                new Num(3)};

        //int [] arr = {1,2,3};
        for (Num n : arr) {
            System.out.println(n.getX()); //1,2,3 출력
        }
    }
}
