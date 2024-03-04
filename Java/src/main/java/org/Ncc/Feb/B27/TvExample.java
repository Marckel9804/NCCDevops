package org.Ncc.Feb.B27;



class Tv{
    String brand;
    int year;
    int price;

    Tv(){}
    Tv(String brand, int year, int price){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    void show(){
        System.out.println(this.brand + ", " + this.year + ", " + this.price);
    }
}
public class TvExample {
    public static void main(String[] args) {
        Tv t = new Tv("삼성", 2022, 20);
        t.show();
    }
}
