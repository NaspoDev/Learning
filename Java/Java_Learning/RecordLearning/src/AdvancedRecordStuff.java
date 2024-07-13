// Other things you can do with Records.

// Inheritance Rules:
// - Records cannot extend any class because they already extend the Record class from Java.
// - You are able to implement interfaces.
public record AdvancedRecordStuff(String name, int age) {
    /*
    --- Custom Variables ---
    If you'd like to create custom variables, you can, but they must be static.
    */
    public static final int EXAMPLE_VARIABLE = 10;

    /*
    --- Overriding Constructor (with Compact Constructor)---
    You can override the default constructor if you want.

    Why would you want to do this? Let's say you want to do some validation on the values, for
    example, an age shouldn't be negative.

    Compact Constructor:
    You don't have to specify the params and assign them. i.e (String name, ...) ... this.name = name;
    The compact constructor, only available in records, will do that for you.
    */
    public AdvancedRecordStuff {
        if (age < 0) {
            throw new IllegalArgumentException("age cannot be negative!");
        }
    }

    /*
    --- Custom methods ---
    You can also add custom methods if you'd like.
    It is a type of class after all ;)
    */
    public String nameInUpperCase() {
        return name.toUpperCase();
    }
}
