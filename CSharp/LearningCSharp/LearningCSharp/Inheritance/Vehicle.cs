using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LearningCSharp
{
    // Vehicle parent class
    // Also testing/learning about abstract class at the same time. Same as Java.
    internal abstract class Vehicle
    {
        // === Fields and Properties - Encapsulation ===
        // Fields are the actual variables, that you ideally want to keep private
        private int topSpeed;

        // Properties are like a combination of a variable and a method, they allow you to interact with the fields.
        // 1. Define a property for a field by using the same name, but starting with a capital. 
        // 2. Now what actually makes this a property is when you use the built-in get and set keywords.
        // As you can see below, you can define them right below the property and write custom logic for it.
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

        // Short hand way for properties, if you don't need middleware logic, is to just define the property with get and set keywords.
        // It will automatically create the field under the hood.
        public string Manufacturer { get; set; }

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
}