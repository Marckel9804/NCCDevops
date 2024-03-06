package org.Ncc.Mar.t05.ex2;

public class main {
    static void pr(Person p) {
        if(p instanceof Person) {
            System.out.println("사람");
        }
        if(p instanceof Student) {
            System.out.println("학생");
        }
        if(p instanceof Entertainer) {
            System.out.println("연예인");
        }
        if(p instanceof Singer) {
            System.out.println("가수");
        }
    }
    public static void main(String[] args) {
        pr(new Student());         //Person p=new Student();  사람 학생
        System.out.println();
        pr(new Entertainer());     //Person p=new Entertainer(); 사람 연예인
        System.out.println();
        pr(new Singer());          //Person p=new Singer(); 사람 연예인 가수
    }
}
