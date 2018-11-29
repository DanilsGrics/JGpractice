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


    private List<Product> products = new ArrayList<>();

    public void add(Product product) {

        products.add(product);
    }

    public void addAll(List<Product> tempList) {

        for (Product product : tempList) {

            products.add(product);
        }
    }

    public void deleteByName(String name) {

        for (Product product : products) {

            if (product.getName().equals(name)) {

                products.remove(product);
                break;
            }
        }
    }


    public Product findByName(String name) {

        for (Product product : products) {

            if (product.getName().equals(name)) {

                return product;
            }
        }

        return null;
    }

    public List<Product> findByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {

        List<Product> productsByPrice = new ArrayList<>();

        for (Product product : products) {

            if (product.getPrice().compareTo(minPrice) >= 0 && product.getPrice().compareTo(maxPrice) <= 0) {

                productsByPrice.add(product);
            }
        }

        return productsByPrice;
    }

    @Override
    public String toString() {

        return "" + products;
    }
}
