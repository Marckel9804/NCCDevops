package org.Book.ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
    public static void printlength(String data) {
        try {       //예외가 나올 수 있는 코드
            int result = data.length();
            System.out.println("문자의 수: " + result);
        } catch (NullPointerException e) {      //예외 시에 처리방안
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            //e.printStackTrace();
        } finally {
            System.out.println("마무리 실행");
        }
    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작\n");
        printlength("This Is Java");
        printlength(null);
        System.out.println("프로그램 종료");
    }
}
