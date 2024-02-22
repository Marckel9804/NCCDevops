package org.example.Ncc.B0222;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Test tt = new Test();
        //tt.problem3();
        tt.problem4();
    }
    public void test12(){
        //1. 중첩 반복문으로 5단부터 9단까지 출력
        for(int i =5; i<10; i++){
            System.out.println(i + "단");
            for(int j = 1; j<10 ; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
        System.out.println();

        //2. while문을 이용해서 1부터 100까지 정수 중 5의배수의 총합을 출력

        int n = 1, sum = 0;
        while(n<101){
            if(n%5==0){
                sum += n;
            }
            n++;
        }
        System.out.println(sum);

    }
    public void problem12(){
        //1.
        System.out.printf("%.0f\n", (50+11.8));

        //2.
        int n = 0;
        while(true){
            if(n%5 == 0){
                n++;
                continue;
            }
            System.out.println(n);
            n++;
            if(n >= 30){
                break;
            }

        }
    }
    public void problem3(){
        //5개의 정수를 입력할 배열을 생성하여 총합을 출력

        Scanner sc = new Scanner(System.in);

        int sum=0;
        int[] arr = new int[5];
        for (int i=0; i<5; i++){
            arr[i]= sc.nextInt();
            sum += arr[i];
        }

        System.out.println("sum = " + sum);
    }

    public void problem4(){
        //1. 1~10까지의 합
        System.out.println("1.");
        System.out.println("for문");
        int sum = 0;
        for(int i =1; i<11;i++){
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("while문");
        sum=0;
        int k=1;
        while(k<11){
            sum+=k;
            k++;
        }
        System.out.println(sum);
        k=1;

        System.out.println("do~while문");
        do{
            sum+=k;
            k++;
        }while(k<11);

        //2.while 문 평균출력
        System.out.println("2.");

        Scanner sc2 = new Scanner(System.in);

        int num=-1, sum2 = 0;
        while(num!=0){
            num = sc2.nextInt();
            sum2+=num;
        }
        System.out.println(sum2);

        //3.

        //3-1.
        System.out.println("3.");
        int i3 = 0, sum3=0;
        while(true){

            i3=i3+2;
            if(i3>=10){
                break;
            }
            sum3+=i3;
        }
        System.out.println(sum3);

        //3-2.

        i3=0;
        sum3=0;

        do{
            if(i3%2==1){
                i3++;
                continue;
            }
            sum3+=i3;
            i3++;
        }while(i3<10);
        System.out.println(sum3);


        System.out.println("4.");
        //4-1.
        char[] arr4_1 = new char[10];
        //4-2.
        char[] arr4_2 = {0,1,2,3,4};
        //4-3.
        String[] arr4_3 = {"java", "c","c++"};
        //4-4.
        int [] arr4_4 = new int[10];
    }
}
