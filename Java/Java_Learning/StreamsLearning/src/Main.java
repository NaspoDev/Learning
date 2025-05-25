// Learning about Java Streams!

import java.util.ArrayList;
import java.util.List;

/*
Stream API is used to process collections of objects.
A stream is a sequence of objects that supports various methods that can be pipelined to produce the desired result.
 */
public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 40));
        people.add(new Person("Lauren", 19));
        people.add(new Person("Justin", 22));
        people.add(new Person("Jordan", 21));
        people.add(new Person("Laya", 20));
        people.add(new Person("Hector", 70));
        people.add(new Person("Gus", 45));

        // Filtering
        // First stream the collection. (This returns a sequential Stream over the elements in this collection).
        // Then perform some kind of intermediate operation, like filtering (which uses lamba expressions in this case).
        // Then collect your data in some way, example toList();
        List<Person> youngPeople = people.stream()
                .filter(p -> p.age < 30)
                .toList();

        // Performing an action on each element.
        /*
        Side remark: Collection.stream().forEach() vs Collection.forEach()
        - Using a stream allows you to append other methods like filter().
        - Using Collection.forEach() runs though the list in order.
         */
        System.out.println("Printing all people:");
        people.stream().forEach(p -> System.out.println(p.toString()));
        // Some other stuff you can do;
        System.out.println("\nPrinting max of 3 people:");
        people.stream().limit(3).forEach(p -> System.out.println(p.toString()));

        // Element transformation
        // map() is a method used in streams to transform each element of the stream into another form.
        // Note that method reference syntax (System.out::println) also works here.
        System.out.println("\nElement transformation, printing names in uppercase:");
        people.stream().map(p -> p.name.toUpperCase()).forEach(System.out::println);

        /*
        Some other notes:
        - A stream uses the original object references, it doesn't create copies.
         */
    }
}
