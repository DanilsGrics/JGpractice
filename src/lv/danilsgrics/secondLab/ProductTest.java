package lv.danilsgrics.secondLab;

public class ProductTest {

    public static void main(String[] args) {

        Product testProduct = new Product();
        Product testProduct2 = new Product();

        testProduct.setName("milk");
        testProduct.setRegularPrice(0.8);
        testProduct.setDiscount(20);

        testProduct2.setName("chocolate");
        testProduct2.setRegularPrice(1.2);
        testProduct2.setDiscount(13);

        testProduct.print();
        testProduct2.print();

    }
}
