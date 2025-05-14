namespace AsyncLearning;

// Learning Asynchronous programming in C#.

/*
 * Task: an asynchronous operation. (Think of Promises in Javascript).
 * async/await: C# supports async/await keywords!
 */
internal class Program
{
    static async Task Main(string[] args)
    {
        Console.WriteLine("We are making your coffee, it will be ready soon.");
        Coffee coffee = await MakeCoffee();

        Console.WriteLine("Here is your coffee!");
        Console.WriteLine($"Milk: {coffee.HasMilk}");
        Console.WriteLine($"Sugar: {coffee.HasSugar}");
    }

    static async Task<Coffee> MakeCoffee()
    {
        Coffee coffee = new();
        await coffee.Brew();
        await coffee.AddMilk();
        await coffee.AddSugar();
        return coffee;
    }
}
