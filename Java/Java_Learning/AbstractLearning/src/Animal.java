public abstract class Animal {

    String sex;
    boolean predator;

    public Animal(String sex, boolean predator) {
        this.sex = sex;
        this.predator = predator;
    }

    // Abstract methods cannot have an initial body. The body is defined by classes that inherit it.
    // (Classes must implement abstract methods).
    abstract void makeNoise();

    void poop() {
        System.out.println("I just shit my animal pants.");
    }

}
