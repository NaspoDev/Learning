// Yeti Rambler class.
// A Yeti Rambler is a specific type of water bottle.

// The Yeti Rambler water bottle object class.
// The interface forces the class that implements it to implement its methods.
public class YetiRambler extends WaterBottle implements TwistCap {

    // String color from WaterBottle class.
    String color = "Black";
    int ounces = 24;


    // Overriding the fillUp() method from the WaterBottle class.
    @Override // override annotation is optional, but good practice
    public void fillUp() {
        System.out.println("Filling up your rambler...");
    }

    // Implementing the methods from the TwistCap interface.
    @Override
    public void twistOffCap() {
        System.out.println("Twisting off piece one...");
        System.out.println("Twisting off piece two...");
    }

    @Override
    public void twistOnCap() {
        System.out.println("Twisting on piece one...");
        System.out.println("Twisting on piece two...");
    }
}
