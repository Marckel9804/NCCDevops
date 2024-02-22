package org.example.Ncc.Feb.B22;
import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        ForExample fe = new ForExample();
        fe.mulTableEx();
        fe.starPrint1();
        fe.starPrint2();
        fe.mulForEx();
    }
    public static void mulTableEx(){
        for (int i= 2; i<10; i++){
            System.out.println("*** " + i + "단 ***");
            for(int j=1; j<10; j++){
                System.out.println(i + " * " + j + " = " + i*j );
            }
            System.out.println();
        }
    }
    public static void starPrint1(){
        for (int i=1; i<6; i++){
            for (int j=1; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void starPrint2() {
        for(int i = 0; i<5; i++){
            for(int j= 0; j<4-i; j++){
                System.out.print(" ");
            }
            int n=1;
            for (int j = 0; j<(2*i)+1; j++){
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }

    public void mulForEx(){
        System.out.print("한 문자 입력 : ");
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        int n = (int)ch; //내가 입력한 문자를 정수로 강제형변환
        System.out.println(n);
        for (int i = 30; i<=n; i++){
            for(int j=i; j<n; j++){
                char c = (char)j;
                System.out.print(c);
            }
            System.out.println();
        }
    }


}
