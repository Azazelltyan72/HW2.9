import java.util.HashSet;
import java.util.Set;

public class Product {

    private final String name;

    private final double price;
    private final int quantity;
    public Product(String name, double price, int quantity) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }


    public void addProduct(Set<Product> products) {
        if (!products.contains(this)) {
            products.add(this);
        } else {
            throw new UnsupportedOperationException("Продукт " + this.name + " уже имеется");
        }
    }


    public int getQuantity() {
        if (quantity > 0) {
            return quantity;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }

    public String getName() {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            return name;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }

    public double getPrice() {
        if (price > 0) {
            return price;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", price = " + price +
                " руб., quantity = " + quantity +
                " кг";
    }
}
