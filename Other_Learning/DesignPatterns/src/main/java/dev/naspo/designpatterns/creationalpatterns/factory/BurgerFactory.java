package main.java.dev.naspo.designpatterns.creationalpatterns.factory;

// The burger factory class, to create different types of pre-defined burgers.
public class BurgerFactory {
    public Burger createCheeseBurger() {
        String[] ingredients = {"bun", "cheese", "beef patty"};
        return new Burger(ingredients);
    }

    public Burger createVeggieBurger() {
        String[] ingredients = {"bun", "veggie patty"};
        return new Burger(ingredients);
    }

    public Burger createDeluxeBurger() {
        String[] ingredients = {"bun", "cheese", "beef patty", "tomato", "lettuce", "onion", "pickles"};
        return new Burger(ingredients);
    }

}
