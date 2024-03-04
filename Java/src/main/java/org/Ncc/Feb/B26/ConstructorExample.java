package org.Ncc.Feb.B26;

class Book{
    String name;
    String author;
    int price;
    Book(){
        this("\t","\t",0);
        System.out.println("파라미터 없는 생성자 호출 끝");
    }
    Book(String name, int n){
        this(name,"\t\t",n);
        System.out.println("파리미터 2개 생성자 호출 끝");
    }
    Book(String name, String author, int n){
        this.name = name;
        this.author = author;
        this.price = n;
        System.out.println("파라미터 3개 생성장 호출 끝");
    }
    void print(){
        System.out.println(name + "\t" + author + "\t" + price);
    }

}

public class ConstructorExample {
    public static void main(String[] args) {
        Book b1 = new Book("고양이","베르나르",30000);
        Book b2 = new Book("자바", 40000);
        Book b3 = new Book();

        b1.print();
        b2.print();
        b3.print();;
    }
}
