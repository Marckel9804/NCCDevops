package org.example.Ncc.Feb.B27;

class Book{
    String title;
    String author;

    Book(){
        this("생성자","호출!!");
    }
    Book(String title){
        this(title,"작가 미상");
    }
    Book(String title, String author){
        this.title = title;
        this.author = author;
        System.out.println(this.title + " " + this.author);
    }
}
public class Quiz2 {
    public static void main(String[] args) {
        Book b1 = new Book("멋진 신세계", "올더스 헉슬리");
        Book b2 = new Book("더 해빙");
        Book b3 = new Book();
    }
}
