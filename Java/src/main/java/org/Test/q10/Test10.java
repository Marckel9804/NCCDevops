package org.Test.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) throws IOException {
        ArrayList<Worker> arr = new ArrayList<Worker>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("<사원 정보 관리 프로그램>\n" +
                    "1. 사원정보 입력\n" +
                    "2. 사원정보 개별 조회\n" +
                    "3. 프로그램 종료");
            int n = Integer.parseInt(br.readLine());

            if(n==1){
                try {
                    System.out.print("사번: ");
                    int number = Integer.parseInt(br.readLine());
                    System.out.print("이름: ");
                    String name = br.readLine();
                    System.out.print("부서: ");
                    String dept = br.readLine();
                    System.out.print("주소: ");
                    String address = br.readLine();
                    System.out.print("생일: ");
                    String birth = br.readLine();
                    arr.add(new Worker(number, name, dept, address, birth));
                    System.out.println("사원정보가 입력되었다.");
                } catch (Exception e){
                    System.out.println("에러발생 다시 시작");
                }
            } else if(n==2){
                System.out.print("검색하고자 하는 사원의 사번은? ");
                int number = Integer.parseInt(br.readLine());
                for (int i=0; i<arr.size(); i++){
                    if(arr.get(i).getNumber() == number){
                        System.out.println("이름: "+ arr.get(i).getName() + "\n" +
                                "부서: " + arr.get(i).getDept() + "\n" +
                                "주소: " + arr.get(i).getAddress() + "\n" +
                                "생일: " + arr.get(i).getBirth() + "\n");
                    }
                }
            } else if (n==3) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
