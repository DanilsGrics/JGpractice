package lv.danilsgrics.eighthLab;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private String name;
    private BigDecimal price;

    Product(String name, BigDecimal price) {

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Product that = (Product) o;

        return Objects.equals(name, that.name) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode()
    {
        return name.hashCode() + price.hashCode();
    }

    @Override
    public String toString() {

        return "\nName of product: " + name + ", price: " + price + "EUR";
    }
}
