// You can also define a file scoped namespace like this:
// namespace LearningCSharp;
// I recommend file scoped namespaces, but just showing block-scoped as demonstration.
namespace LearningCSharp
{
    internal class Program
    {
        // The CLR (Common Language Runtime) will always look for a Main() method
        private static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            // String formatting
            string firstName = "Athanasios";
            string lastName = "Topaltsis";
            Console.WriteLine("Hello {0} {1}", firstName, lastName);
            Console.WriteLine($"Hello {firstName} {lastName}. Let's learn C#!");
            Console.WriteLine(@"C:\example\path"); // '@' denotes string literal (raw string)

            // Primitive types are the exact same as Java
            // Defining constants
            const string MyConst = "I am a constant"; // Notice how consts are PascalCase.

            // Implicit Type Conversion
            // If possible, values will be implicitly converted without the need to use some kind of utility method.
            int val = 1;
            float val2 = val;
            // Otherwise you can do something like this:
            string stringVal = "1";
            int i = int.Parse(stringVal); // Use the type's built in Parse method
            int j = Convert.ToInt32(stringVal); // Or you can use the convert class
            // Casting also exists in this language

            // Support function programming patterns like lambda expressions
            Func<int, int> doubleIt = x => x * 2;
            Console.WriteLine(doubleIt(10));

            // Make a variable nullable
            // By default, a variable cannot be null, but you can make it nullable by adding a question mark
            string? hello = null;

            // For each loop
            string[] fruits = { "Apple", "Pear", "Banana", "Strawberry" };
            foreach (string fruit in fruits)
            {
                Console.Write(fruit + " ");
            }

            // Testing classes and inheritance...
            Car sonata = new(220, "Hyundai", "Sonata");
            Console.WriteLine("My car's info:");
            Console.WriteLine($"Manufacturer: {sonata.Manufacturer}, Model: {sonata.Model}, top speed: {sonata.TopSpeed}");

            // Usage of our checkout method (see below)
            Console.WriteLine("Your total is: " + checkout(10.5, 20, 19.99, 34, 10));

            // Overflow checking does not happen by default in C#, so, the value would by default overflow to 0;
            // If you want the program to throw an exception if overflow occurs, surround it the code in a "checked" block.
            //checked
            //{
            //    byte a = 255;
            //    a += 1;
            //}

            // Multi-dimensional arrays. Each additional dimension is represented with a comma
            int[,] twoDArray = { { 1, 2, 3 }, { 1, 2, 3 } };
            int[,,] threeDArray = { { { 1, 2, 3 } }, { { 1, 2, 3 } } };

            // Testing our structs. (see Structs.sc)
            Structs structs = new Structs();
            structs.DoSomething();

            /*
            var keyword (spoiler: dont use this)
            The var keyword is instructs the compiler to infer the type of the variable from 
            the expression on the right side of the initialization statement

            Example: Dictionary<string, int> dict = new Dictionary<string, int>(); would turn into the code below.
            
            *General consensus: dont use this.
            */
            var myDict = new Dictionary<string, int>();
        }

        // in C#, you can explicitly define if a value should be passed as a reference type of a value.
        public void DoSomething(ref int value)
        {
            // ...
        }

        // params keyword
        // Use the params keyword to allow any number of arguments of a certain type.
        // For example: The checkout method takes as many items as the user is buying and will return the total cost.
        public static double Checkout(params double[] prices)
        {
            double total = 0;

            foreach (double price in prices)
            {
                total += price;
            }

            return total;
        }
    }
}