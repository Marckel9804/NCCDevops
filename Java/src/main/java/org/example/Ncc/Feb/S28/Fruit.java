package org.example.Ncc.Feb.S28;

public class Fruit {
    private String color;
    Fruit(String color){
        this.color = color;
    }

    String getColor() {
        return this.color;
    }


    void show() {
        System.out.println(getColor() + " " + 10);
    }
}
