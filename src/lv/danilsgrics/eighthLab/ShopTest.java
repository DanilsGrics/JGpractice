package lv.danilsgrics.eighthLab;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    public static void main(String[] args) {

        ShopTest testRunner = new ShopTest();

        testRunner.preloadedListTest();
        testRunner.productAddAndAddAllTest();
        testRunner.findByPriceRangeTest();
        testRunner.findByNameTest();
        testRunner.deleteByNameTest();
    }

    public List<Product> existingList () {

        List<Product> existingList = new ArrayList<>();
        existingList.add(new Product("Bounty", new BigDecimal("0.48")));
        existingList.add(new Product("Twix", new BigDecimal("0.53")));

        return existingList;
    }

    public void deleteByNameTest() {

        Shop victim = new Shop(existingList());

        victim.deleteByName("Twix");

        String expectedResult = ("[\nName of product: Bounty, price: 0.48EUR]");
        String actualResult = victim.toString();

        check(actualResult, expectedResult, "productAddAndAddAllTest");
    }

    public void findByNameTest() {

        Shop victim = new Shop(existingList());

        String expectedResult = ("\nName of product: Bounty, price: 0.48EUR");
        String actualResult = victim.findByName("Bounty").toString();

        check(actualResult, expectedResult, "findByNameTest");
    }

    public void productAddAndAddAllTest() {

        Product product1 = new Product("Rasens Piens", new BigDecimal("0.55"));
        Product product2 = new Product("Cido Vinogu", new BigDecimal("1.19"));

        Shop victim = new Shop();

        victim.addAll(existingList());
        victim.add(product1);
        victim.add(product2);

        String expectedResult = ("[\n" +
                "Name of product: Bounty, price: 0.48EUR, \n" +
                "Name of product: Twix, price: 0.53EUR, \n" +
                "Name of product: Rasens Piens, price: 0.55EUR, \n" +
                "Name of product: Cido Vinogu, price: 1.19EUR]");
        String actualResult = victim.toString();

        check(actualResult, expectedResult, "productAddAndAddAllTest");
    }

    public void preloadedListTest() {

        Shop victim = new Shop(existingList());

        String expectedResult = ("[\n" +
                "Name of product: Bounty, price: 0.48EUR, \n" +
                "Name of product: Twix, price: 0.53EUR]");
        String actualResult = victim.toString();

        check(actualResult, expectedResult, "preloadedListTest");
    }

    public void findByPriceRangeTest() {

        Product product1 = new Product("Rasens Piens", new BigDecimal("0.55"));
        Product product2 = new Product("Cido Vinogu", new BigDecimal("1.19"));

        Shop victim = new Shop();

        victim.addAll(existingList());
        victim.add(product1);
        victim.add(product2);

        String expectedResult = ("[\n" +
                "Name of product: Bounty, price: 0.48EUR, \n" +
                "Name of product: Twix, price: 0.53EUR, \n" +
                "Name of product: Rasens Piens, price: 0.55EUR]");

        String actualResult = victim.findByPriceRange(new BigDecimal("0.48"), new BigDecimal("0.55")).toString();

        check(actualResult, expectedResult, "findByPriceRangeTest");
    }

    public void check(String actualResult, String expectedResult, String testName) {

        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
