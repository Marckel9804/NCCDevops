package org.example.Study.Feb.S27;

public class Check6_18 {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 Shopservice 객체입니다.");
        } else {
            System.out.println("같은 Shopservice 객체입니다.");
        }
    }
}