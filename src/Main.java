import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1.1");
        Set<Product> products = new HashSet<>();

        Product bananas = new Product("Банан", 20.99, 1);
        Product tomatos = new Product("Помидор", 20.99, 2);
        Product cucmbers = new Product("Огурцы", 20.99, 2);
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

        System.out.println("Task 2.1");

        Recipe salat = new Recipe("Salat",55.99);
        Recipe salat2 = new Recipe("Salat2",55.99);
        salat.getIngredients().add(tomatos);
        salat.getIngredients().add(cucmbers);
        salat.getIngredients().add(eggs);

        salat2.getIngredients().add(tomatos);
        salat2.getIngredients().add(cucmbers);
        salat2.getIngredients().add(eggs);
        System.out.println(salat);
        System.out.println(salat.getIngredients().size());

        Set<Recipe> recipes = new HashSet<>();
        salat.addRecipe(recipes);

        System.out.println("Task 2.2");

        Set<Integer> integers = new HashSet<>();

        for (int i = 0; i < 21; i++) {
            integers.add((int) (Math.random() * 1000) + 1);
        }

        integers.removeIf(Integer -> Integer % 2 != 0);
        System.out.println(integers);

    }
}