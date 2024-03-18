package org.Test.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Circle{
    private double r;
    Circle(double r){
        this.r=r;
    }
    double area(){
        return 3.14*r*r;
    }
}
public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Circle[] car = new Circle[5];
        double sum=0;
        for (int i=0; i<5; i++){
            int r = Integer.parseInt(br.readLine());
            car[i]= new Circle(r);
            sum+=car[i].area();
        }
        System.out.println("면적의 총합 = "+sum);
    }
}
