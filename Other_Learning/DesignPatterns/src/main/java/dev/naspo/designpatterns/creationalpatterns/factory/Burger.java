package main.java.dev.naspo.designpatterns.creationalpatterns.factory;

import java.util.Arrays;

// The burger class, to be built by the BurgerFactory.
public class Burger {

    private String[] ingredients;
    Burger(String[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return Arrays.toString(ingredients);
    }
}
