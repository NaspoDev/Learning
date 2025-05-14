using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AsyncLearning;
internal class Coffee
{
    public bool IsBrewed { get; private set; }
    public bool HasMilk { get; private set; }
    public bool HasSugar { get; private set; }

    public async Task Brew()
    {
        // Artificial delay to simulate some async task being done.
        Console.WriteLine("Brewing coffee...");
        await Task.Delay(1000);
        IsBrewed = true;
        Console.WriteLine("Brewing finished.");
    }

    public async Task AddMilk()
    {
        Console.WriteLine("Adding milk...");
        await Task.Delay(1000);
        HasMilk = true;
        Console.WriteLine("Milk added.");
    }

    public async Task AddSugar()
    {
        Console.WriteLine("Adding sugar...");
        await Task.Delay(1000);
        HasSugar = true;
        Console.WriteLine("Sugar added.");
    }
}
