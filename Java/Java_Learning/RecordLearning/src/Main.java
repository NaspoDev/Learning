public class Main {
    public static void main(String[] args) {

        // Records: A better way to work with Data Records in code. (Records > Data Classes).

        /*
        Commonly we create record-like classes everywhere, ex. an Employee class, where all it does
        is hold data. Usually usd to hold database results, etc. With that class you'd have to manually
        create variables, getters, setters, toString methods, equals method, hashCode methods, etc...

        Around 100 lines of code just to hold a little bit of basic data.
        -> Or you can just make a Record. Java will do all of that for you automatically. :D
        */

        Employee employee = new Employee("Justin", 10495);

        // All the awesome things records do for you!
        System.out.println(employee.name());
        System.out.println(employee.id());
        System.out.println(employee.toString());
        System.out.println(employee.hashCode());
        Employee employee2 = new Employee("Justin Lieu", 10495); // using to test equals() method
        System.out.println(employee.equals(employee2));

        // Testing other advanced record stuff.
        AdvancedRecordStuff person = new AdvancedRecordStuff("Joy", 9);
        // Testing out custom methods and vars.
        System.out.println(person.name());
        System.out.println(person.age());
        System.out.println(person.nameInUpperCase());
    }
}