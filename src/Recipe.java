import java.util.*;

public class Recipe {
    private final Set<Product> ingredients;
    private final String name;
    private double totalCost;

    public Recipe(String name, double totalCost) {
        ingredients = new HashSet<>();
        this.name = name;
        if (totalCost > 0) {
            this.totalCost = totalCost;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }

    public Set<Product> getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }

    public final double getTotalCost() {
        if (totalCost > 0) {
            return totalCost;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }
    public void addRecipe(Set<Recipe> recipes) {
        if (!recipes.contains(this)) {
            recipes.add(this);
        } else {
            throw new UnsupportedOperationException("Рецепт " + this.name + " уже имеется");
        }
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", totalCost=" + totalCost +
                "руб.}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
//        return totalCost == recipe.totalCost && ingredients.equals(recipe.ingredients) && name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredients, name, totalCost);
    }
}
