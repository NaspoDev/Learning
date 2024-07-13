public class Main {
    public static void main(String[] args) {

        // Inheritance (extends): The process where one class acquires the attributes and methods of another.
        // It's a form of polymorphism. Many forms = poly morph(ism). Many forms of Car.

        // Notable things about inheritance:
        // - Creates a hierarchical relationship between classes.
        // - Subclass inherits fields and method implementations from a single superclass.

        // Car and Bicycle classes both extend Vehicle.
        Car car = new Car(60, "Hyundai Sonata", 2015);
        Bicycle bike = new Bicycle(15, "Garneau", 2022);

        System.out.println(car.doors + " doors on our " + car.year + " " + car.make);
        System.out.println(bike.pedals + " pedals on our " + bike.year + " " + bike.make + " bike");
        car.move(); // no override method, uses vehicle's
        car.stop(); // use the car's stop method (overrides vehicle's)
        bike.move(); // uses bike's move method (overrides vehicle's)
    }
}