public class Main {
    public static void main(String[] args) {

        // Interface: An interface is a blueprint for a class.
        // Use it for defining common behavior that multiple classes can have, or abstract things.

        // In this project example, we will show the difference between inheritance (extends) and an interface.

        /*
         Notable things about interfaces:
         - The implementing class has to have every method from the interface.
         - A class can implement multiple interfaces, allowing for multiple inheritance of behavior.
         - Interfaces are ideal for defining common behavior that multiple classes can share,
           irrespective of their inheritance hierarchy.
         - All methods in an interface are abstract.
         - All methods in an interface are automatically public.  The keyword public does not appear.
         - Interfaces do not have instance variables because no objects of the interface type can be created!
         - Any variables declared in an interface are automatically public, static, and final (i.e. constants).
          */

        // This example:
        // Say we want to make a water bottle, we inherit (extend) from the main WaterBottle class.
        // The YetiRambler bottle has a twist cap though, so we implement the TwistCap interface.

        YetiRambler rambler = new YetiRambler();
        // Inheritance from WaterBottle class stuff:
        System.out.println(rambler.color);
        System.out.println(rambler.ounces);
        rambler.fillUp();
        // TwistCap interface stuff:
        rambler.twistOffCap();
        rambler.twistOnCap();
    }
}