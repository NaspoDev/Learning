// Generic Printer class
// Prints any object you pass into it.

// <T> is the type parameter. T is convention, but you can call it whatever you want. Ex <MyType> or <Any>.
public class Printer <T> {

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
