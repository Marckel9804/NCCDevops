package org.Ncc.Mar.t08.arrayListReview;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    ArrayList<Person> pal = new ArrayList<Person>(5);
    Game(){
        // 리스트에 값 추가;
        pal.add(new Person("se", 123));
        pal.add(new Person("sdss", 12));
        pal.add(new Person("weq", 1234));
        pal.add(new Person("sasf", 1235));

    }
    void in() {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("이름 Id 입력");
            String name = sc.next();
            if(name.equals("stop")){
                break;
            }
            int id = sc.nextInt();
            Person inp = new Person(name,id);

            if(pal.contains(inp.getName())){
                System.out.println("이미 존재하는 이름");
            } else {
                pal.add(inp);
            }
        }
    }
    void out() {
        while (true) {
            Random r = new Random();
            int n = r.nextInt(pal.size());
            //pal 객체 크기 만큼 임의 숫자 부여

            Person p = pal.get(n);
            System.out.println(p.getId() + " " +p.getName());

            Scanner sc = new Scanner(System.in);
            int id2 = sc.nextInt();

            if(id2 == -1){
                break;
            }
            if(id2 == p.getId()){
                System.out.println("정답");
            } else {
                System.out.println("오답");
            }
        }
    }
    void end(){
        System.out.println("프로그램 종료");
        System.exit(0);
    }
}
