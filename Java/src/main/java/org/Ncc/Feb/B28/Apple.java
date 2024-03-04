package org.Ncc.Feb.B28;

public class Apple extends Fruit{
    int price;
    Apple(String color, int price){
        super(color);
        this.price = price;
    }

    @Override
    void show() {
        System.out.println(getColor() + " " + this.price);
    }
}
