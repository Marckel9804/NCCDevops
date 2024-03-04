package org.Ncc.Feb.B26;

class Car4 {
    String model, name;
    Car4(String m){
        this(m,"벤츠");
    }

    Car4(String m, String n){
        model = m;
        name = n;
    }
}
public class CarExample4 {
    public static void main(String[] args) {
        Car4 car1 = new Car4("자가용", "벤츠");
        System.out.println(car1.model + " " + car1.name);

        Car4 car2 = new Car4("캠핑카");
        System.out.println(car2.model + " " + car2.name);
    }
}
