// Child class
public class Car extends Vehicle {

    // Even if wheels is already defined in Vehicle, you still have to redeclare it here if you
    // want to make changes to it for the child class.
    int wheels = 4; // overriding the wheels variable for Car
    int doors = 4; // custom variable to this class

    // Using the superclass' implementation of initializing common variables for this car.
    // (Does this.speed = speed and so on for each car initialized).
    public Car(double speed, String make, int year) {
        super(speed, make, year);
    }

    // Override the stop() method from the parent Vehicle class
    @Override // override annotation not required, but best practice for readability and compiler.
    void stop() {
        System.out.println("Slam the breaks!");
        super.stop(); // calling the superclasses implementation of the stop method.
    }
}
