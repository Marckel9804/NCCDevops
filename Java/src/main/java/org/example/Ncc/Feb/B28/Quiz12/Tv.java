package org.example.Ncc.Feb.B28.Quiz12;

public class Tv {
    String brand;
    int year;
    int length;

    Tv (String brand, int year, int length) {
        this.brand = brand;
        this.year = year;
        this.length = length;
    }

    void show() {
        System.out.println(year + "년에 " + brand + "에서 나온 " +
                length +"인치 Tv");
    }
}
