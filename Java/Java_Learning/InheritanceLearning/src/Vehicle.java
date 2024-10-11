// Parent Class
public class Vehicle {

    // All vehicles should have these properties.
    double speed;
    String make;
    int year;

    public Vehicle(double speed, String make, int year) {
        this.speed = speed;
        this.make = make;
        this.year = year;
    }

    // All vehicles should have a move methods and a stop method.
    void move() {
        System.out.println("This vehicle is moving!");
    }

    void stop() {
        System.out.println("This vehicle is stopped.");
    }
}
