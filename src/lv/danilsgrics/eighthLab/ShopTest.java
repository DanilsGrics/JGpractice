package lv.danilsgrics.eighthLab;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    public static void main(String[] args) {

        List<Product> existingList = new ArrayList<>();
        existingList.add(new Product("Bounty", new BigDecimal("0.48")));
        existingList.add(new Product("Twix", new BigDecimal("0.53")));
        System.out.println(existingList);

        Shop shop = new Shop(existingList);

        System.out.println(shop);

        Shop shop2 = new Shop();

        shop2.addProduct("Rasens Piens", new BigDecimal("0.55"));
        shop2.addProduct("Cido Vinogu", new BigDecimal("1.19"));

        System.out.println(shop2);

        shop2.addProductsFromList(existingList);

        System.out.println(shop2);

        shop2.getAllProductsByPrice(new BigDecimal("0.48"), new BigDecimal("0.55"));

        shop2.getProductByName("Twix");

        shop2.deleteProductByName("Twix");

        System.out.println(shop2);
    }
}
