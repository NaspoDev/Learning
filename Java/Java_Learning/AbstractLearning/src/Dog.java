public class Dog extends Animal {

    String name;

    public Dog(String sex, boolean predator, String name) {
        super(sex, predator);
        this.name = name;
    }

    // Inheriting mandatory abstract class from Animal.
    @Override
    void makeNoise() {
        System.out.println("Woof woof!");
    }
}
