package main.java.dev.naspo.designpatterns.creationalpatterns.builder;

// BurgerBuilder class, to build a burger step by step.
// Each step return the BurgerBuilder object (itself), so we can chain the steps together.
// The build() method returns the final burger object.
public class BurgerBuilder {
    private Burger2 burger;

    public BurgerBuilder() {
        this.burger = new Burger2();
    }

    public BurgerBuilder setBun(String bunStyle) {
        this.burger.setBun(bunStyle);
        return this;
    }

    public BurgerBuilder setCheese(String cheeseType) {
        this.burger.setCheese(cheeseType);
        return this;
    }

    public BurgerBuilder setPatty(String pattyType) {
        this.burger.setPatty(pattyType);
        return this;
    }

    // The build() method returns the final burger object.
    public Burger2 build() {
        return this.burger;
    }
}
