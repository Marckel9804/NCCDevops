package org.Ncc.Feb.B22;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample ae = new ArrayExample();
        //ae.ex1();
        //ae.ex2();
        //ae.maxEx2();
        //ae.For_EachEx();
        ae.mulArrayEx2();
    }

    //타입[] 변수; || 타입 변수[];
    //타입[] 변수 = null; 배열은 참조변수라 null로 초기화 가능
    public void ex1 () {
        //타입[] 변수; || 타입 변수[];
        //타입[] 변수 = null; 배열은 참조변수라 null로 초기화 가능
        int[] arr = {3,4,5, 2};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        //배열.length = 배열의 길이
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void maxEx1(){
        int [] arr = {1,5,3,8,2};
        int max = 0;

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
    }
    public void maxEx2(){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        int max = 0;

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public void ex2(){
        int[] arr = new int[10];

        //1 2 3 5 8 13 21 34 55 89(피보나치 수열)

        arr[0]=1;
        arr[1]=2;

        for (int i = 2; i<10; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        for (int i=0; i<10; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void For_EachEx(){
        //for-each문
        String[] str = {"컴퓨터", " 자바", "DB"};
        for (String s : str){
            System.out.println(s);
        }
    }

    public void mulArrayEx1(){
        int[ ][] a = new int[2][3];

        int[][] b = {
                {1,2,3},
                {4,5,6}
        };

        int[][] c ={
                {1,2,3},
                {4,5}
        };
        //c배열은 열이 일정하지 않아서 행의 길이가 다르다.
        System.out.println(c[0].length);
        System.out.println(c[1].length);
    }
    public void mulArrayEx2(){
        int arr1[][] = {
                {1,2,3,4},
                {5,6,7,8}
        };
        int arr2[][] = {
                {1,2,3,4},
                {5,6,7}
        };
        for (int i=0; i<2; i++){
            for (int j=0; j<4; j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

    }
}
