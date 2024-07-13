import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Generics: A way to make classes and methods more flexible and reusable.
        // Generic/any type.

        // Instead of making a IntegerPrinter class, and a DoublePrinter class, and a StringPrinter class, etc...
        // We can make one Printer class that can print any type of object.
        // Then we just create a new instance of Printer with the desired type and pass in the object we want to print.

        Printer<Integer> integerPrinter = new Printer<>(23);
        Printer<Double> doublePrinter = new Printer<>(23.5);
        Printer<String> stringPrinter = new Printer<>("Hello World!");

        // Look familiar? Remember ArrayLists?
        ArrayList<Integer> integerArrayList = new ArrayList<>(); // Ha! ArrayList is a generic class!

        // You can create generics of any type, but you lose type safety.
    }
}