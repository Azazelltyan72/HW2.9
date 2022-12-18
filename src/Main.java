import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();

        Product bananas = new Product("Банан", 20.99, 1);
        Product tomatos = new Product("Помидор", 20.99, 2);
        Product potatos = new Product("Картошка", 20.99, 1);
        Product eggs = new Product("Яйца", 20.99, 1);
        Product apples = new Product("Яблоки", 20.99, 1);

        bananas.addProduct(products);
        tomatos.addProduct(products);
        potatos.addProduct(products);
        eggs.addProduct(products);
        apples.addProduct(products);
//        apples.addProduct(products);
        System.out.println(products.size());
        System.out.println("В списке продуктов имеются " + Arrays.toString(products.toArray()));
    }
}