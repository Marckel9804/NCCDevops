package org.Book.ch11.sec03.ex03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] arr = {"100","1oo", null, "200"};

        for (int i=0; i<=arr.length; i++) {
            try {
                int value = Integer.parseInt(arr[i]);
                System.out.printf("arr["+i+"] = " +value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.printf("배열 인덱스 초과");
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("데이터에 문제 있음");
            }
        }
    }
}
