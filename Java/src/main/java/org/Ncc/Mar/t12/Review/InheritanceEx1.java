package org.Ncc.Mar.t12.Review;

import org.Ncc.Mar.t06.thread2.Sh;

import java.util.Scanner;
class Shape { // 도형의 슈퍼 클래스
    public void draw() {
        System.out.println("Shape");
    }
}
class Line extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Line");
    }
}
class Rect extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Circle");
    }
}

public class InheritanceEx1 {
    static void pr(Shape p) {
        p.draw();
    }
    public static void main(String[] args) {
        Line line = new Line();
        pr(line);
        pr(new Shape());
        pr(new Line());
        pr(new Rect());
        pr(new Circle());
    }
}

