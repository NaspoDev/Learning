package main.java.dev.naspo.designpatterns.creationalpatterns.builder;

// Burger class, to be built by the BurgerBuilder.
public class Burger2 {

    // Ingredients
    private String bun;
    private String cheese;
    private String patty;

    // Setters
    public void setBun(String bunStyle) {
        this.bun = bunStyle;
    }

    public void setCheese(String cheeseType) {
        this.cheese = cheeseType;
    }

    public void setPatty(String pattyType) {
        this.patty = pattyType;
    }

    // Getters
    public String getBun() {
        return bun;
    }

    public String getCheese() {
        return cheese;
    }

    public String getPatty() {
        return patty;
    }

    @Override
    public String toString() {
        String[] ingredients = {bun, cheese, patty};
        return String.join(", ", ingredients);
    }
}
