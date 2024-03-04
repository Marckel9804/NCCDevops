package org.example.Ncc.Feb.B29.e7;


public class Test {
    public static void main(String[] args) {
        //객체 배열: 객체를 저장할 수 있는공간(
        Circle [] arr  = new Circle[4];      //int[] arr = new int[4];

        //객체를 4개 생성해서 배열위치에 저장
        for (int i=0; i<arr.length; i++){
            arr[i] = new Circle(i);
            System.out.println(arr[i].area());
        }
    }
}
