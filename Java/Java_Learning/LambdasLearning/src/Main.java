// Lambdas Learning

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

// Lambdas are methods that can be defined and used as a variable/object.
// Similar to arrow functions in javascript.
public class Main {
    public static void main(String[] args) {
        // Example 1
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.forEach((n) -> System.out.println(n));

        // Example 2
        StringFunction exclaim = (s) -> System.out.println(s + "!");
        exclaim.run("Hello World");

        // Example 3
        /*
        In this example we have a HashMap of Strings and Functions. The Strings are operators which
        map to a function, (made from the Function interface), which takes in an array of arguments.
        In this case we are using 2 arguments, the operands, and performing and returning the
        relevant operation on them.
         */
        HashMap<String, Function<Integer[], Integer>> operations = new HashMap<>();
        operations.put("+", (operands) -> operands[0] + operands[1]);
        operations.put("-", (operands) -> operands[0] - operands[1]);
        operations.put("*", (operands) -> operands[0] * operands[1]);
        operations.put("/", (operands) -> operands[0] / operands[1]);

        Integer[] myNumbers = {1, 3};
        for (String s : operations.keySet()) {
            // Notice the apply() method is used to apply the function.
            System.out.println(myNumbers[0] + " " + s + " " + myNumbers[1] + " equals " +
                    operations.get(s).apply(myNumbers));
        }
    }
}