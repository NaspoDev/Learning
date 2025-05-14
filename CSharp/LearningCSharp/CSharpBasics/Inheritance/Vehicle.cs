namespace LearningCSharp;

// Vehicle parent class
// Also testing/learning about abstract class at the same time. Same as Java.
internal abstract class Vehicle
{
    // === Properties ===
    // Properties will create a private filed under the hood, and provides get and set functionality.
    // Ex. Get: vehicle.Manufacturer | Set: Manufacturer = "value"
    public string Manufacturer { get; set; }

    // Properties with custom get/set logic
    // 1. Define a field, the actual variable. (That you ideally want to keep private).
    private int topSpeed;
    // 2. Define a property for a field by using the same name, but starting with a capital. 
    // 3. Write your custom logic in the get and/or set fields.
    public int TopSpeed
    {
        get { return topSpeed; }
        set
        {
            // "value" is the built in keyword for a setter argument's value.
            if (value <= 0)
            {
                Console.WriteLine("Top speed must be greater than 0!");
            }
            else
            {
                topSpeed = value;
            }
        }
    }

    // get-only properties.
    // Can only be set from inside the class. 
    // Ex. MyGetOnlyProp = 1 will only work in here, not anywhere else.
    public int MyGetOnlyProp { get; private set; }

    // init-only properties can only be set once on initalization of the class. After that they become immutable.
    public int MyProperty { get; init; }

    public Vehicle(int topSpeed, string manufacturer)
    {
        // In the constructor, set the variables through its properties.
        TopSpeed = topSpeed;
        Manufacturer = manufacturer;
    }

    // the virtual keyword allows this method to be overridden by its children
    public virtual void move()
    {
        Console.WriteLine("I am moving!!");
    }

    public abstract void stop();
}