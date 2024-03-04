package org.Ncc.Feb.B22;

import java.util.Scanner;

public class NewOperEx {
    //new는 객체 생성 연산자이다
    public static void main(String[] args) {
        NewOperEx noe = new NewOperEx();
        noe.ex1();
        noe.ex2();
    }
    public void ex1(){
        //1.정수 5개를 저장할 배열
        int a[] = new int[5];

        //2. 실수 10개를 저장할 배열
        double []b = new double[10];

        //3. 배열 요소 수가 3개인 int형 배열
        int[] c = new int[3];

        //4. 인덱스의 최대값이 4인 char 형 배열
        char[] d = new char[5];

        //5.
    }
    public void ex2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("실수 5개 입력 : ");

        double arr[] = new double[5];

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextDouble();
            System.out.println(arr[i]);
        }


    }
}
