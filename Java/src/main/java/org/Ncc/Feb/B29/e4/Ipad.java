package org.Ncc.Feb.B29.e4;

public class Ipad extends Note{
    int price;

    Ipad(String color, int number, int price) {
        super(color, number);
        this.price = price;
    }

    void show() {
        System.out.println(super.color+ " " + super.number + " " + price);
    }
}
