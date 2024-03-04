package org.Study.Mar.s03.check18;

public class ShopService {
    private static ShopService shopService = new ShopService();

    private ShopService() {}

    public static ShopService getInstance() {
        return shopService;
    }
}
