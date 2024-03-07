package org.Ncc.Mar.t06.quiz47;

import java.util.Scanner;

class Circle {
    private double x, y;
    private int r;

    Circle(double x, double y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    void show() {
        System.out.println(x + " " + y + " " +r);
    }
}
public class quiz7 {
    public static void main(String[] args) {
        Circle[] c = new Circle[3];
        //ArrayList<Circle> c = new ArrayList<Circle>(3);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int r = sc.nextInt();
            c[i]= new Circle(x,y,r);
        }
        for (int i = 0; i < 3; i++) {
            c[i].show();
        }
    }
}
