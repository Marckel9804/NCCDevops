package org.Ncc.Feb.B29.e13;

import java.util.Scanner;

public class Arr {
    PhoneNum [] arr;
    int n;

    Arr(int n) {
        arr = new PhoneNum[n]; //PhoneNum [] arr = new PhoneNum[5];
        n = 0;
    }

    void add(PhoneNum p) {
        arr[n++] =p;
    }
    void friend(char ch) {
        Scanner sc= new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("번호 : ");
        String phone = sc.next();

        switch (ch){
            case 'A':
                System.out.println("전공 : ");
                String major = sc.next();
                add(new School(name,phone,major));
                break;
            case 'B':
                System.out.println("직급 : ");
                String grade = sc.next();
                add(new Company(name,phone, grade));
                break;
        }
    }

    void all() {
        for (int i = 0; i < n; i++) {
            arr[i].show();
        }
    }
}
