// Child class
public class Car extends Vehicle {

    int wheels = 4; // cars have wheels
    int doors; // custom variable to this class

    // Using the superclass' implementation of initializing common variables for this car.
    // (Does this.speed = speed and so on for each car initialized).
    public Car(double speed, String make, int year, int doors) {
        super(speed, make, year);
        this.doors = doors;
    }

    // Override the stop() method from the parent Vehicle class
    @Override // override annotation not required, but best practice for readability and compiler.
    void stop() {
        System.out.println("Slam the breaks!");
        super.stop(); // calling the superclasses implementation of the stop method.
    }
}
