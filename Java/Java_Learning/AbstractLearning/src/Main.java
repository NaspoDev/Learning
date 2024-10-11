public class Main {
    public static void main(String[] args) {

        // Abstraction: Abstract classes cannot be instantiated.

        // Why would you want to do this?
        // In this example, the Animal class is abstract. The class/object Animal is too general,
        // why would you want to make an instance of the Animal class? It's too broad.
        // It's meant to be inherited by other classes like Dog, that you would instantiate.

        Dog rocket = new Dog("Male", false, "Rocket");
        System.out.println(rocket.name);
        System.out.println(rocket.predator);
        rocket.makeNoise();
        rocket.poop();
    }
}