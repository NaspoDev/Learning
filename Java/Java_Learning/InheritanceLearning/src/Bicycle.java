// Child class
public class Bicycle extends Vehicle {

    int wheels = 2; // bikes have wheels
    double speed = 5.5; // overriding the speed variable for Bicycle
    int pedals = 2; // custom variable to this child

    // Using the superclass' implementation of initializing common variables for this car.
    // (Does this.speed = speed and so on for each car initialized).
    public Bicycle(double speed, String make, int year) {
        super(speed, make, year);
    }

    // Override the move() method from the parent Vehicle class
    @Override // // override annotation not required, but best practice for readability and compiler.
    void move() {
        System.out.println("I am a bike and I have started pedaling!");
    }
}
