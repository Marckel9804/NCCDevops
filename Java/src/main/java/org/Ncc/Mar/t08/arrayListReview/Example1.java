package org.Ncc.Mar.t08.arrayListReview;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Game g = new Game();
        Scanner sc= new Scanner(System.in);

        while (true) {
            System.out.println("1,2,3");
            //1.입력 (in 함수)
            //2.out 함수
            //3. end
            int select = sc.nextInt();
            switch (select){
                case 1:
                    g.in();
                    break;
                case 2:
                    g.out();
                    break;
                case 3:
                    g.end();
                    break;
            }
        }
    }
}
