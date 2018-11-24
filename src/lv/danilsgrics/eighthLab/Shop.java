package lv.danilsgrics.eighthLab;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    Shop() {
    }

    Shop(List<Product> products) {
        this.products = products;
    }


    List<Product> products = new ArrayList<>();

    public void addProduct(String name, BigDecimal price) {

//        BigDecimal bd = price;
//        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);

        if (!products.contains(new Product(name, price))) {

            products.add(new Product(name, price));
            System.out.println("Product added successfully!");
        }
    }

    public void addProductsFromList(List<Product> tempList) {

        for (Product product : tempList) {

            if (!products.contains(product)) {

                products.add(product);
                System.out.println("Product added successfully!");
            }
        }
    }

    public void deleteProductByName(String name) {

        for (Product product : products) {

            if (product.getName().equals(name)) {

                products.remove(product);
                break;
            }
        }

        System.out.println("Product removed successfully!");
    }


    public Product getProductByName(String name) {

        for (Product product : products) {

            if (product.getName().equals(name)) {

                System.out.println(product);
                return product;
            }
        }

        return null;
    }

    public List getAllProductsByPrice(BigDecimal minPrice, BigDecimal maxPrice) {

        List<Product> productsByPrice = new ArrayList<>();

        for (Product product : products) {

            if (product.getPrice().compareTo(minPrice) >= 0 && product.getPrice().compareTo(maxPrice) <= 0) {

                productsByPrice.add(product);
            }
        }

        System.out.println(productsByPrice);

        return productsByPrice;
    }

    @Override
    public String toString() {

        return "" + products;
    }
}
