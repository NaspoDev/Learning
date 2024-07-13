using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LearningCSharp
{
    // Car class inherits from Vehicle class and implements the IManualTransmission interface.
    // Colon is inheritance and implement operator, thats why we tend to start interface names with "I", because it differentiates them.
    internal class Car : Vehicle, IManualTransmission
    {
        public const int Wheels = 4;
        public string Model { get; set; }

        // "base" is C#'s super keyword. 
        // To use the parent class' constructor implementation, use the colon followed by the base() usage.
        public Car(int topSpeed, string manufacturer, string model) : base(topSpeed, manufacturer)
        {
            // Constructor operations specific to this child class go here.
            Model = model;
        }

        // A class can also have destructors when the class goes out of scope
        ~Car()
        {
            Console.WriteLine("I'm in heaven now.");
        }

        // override functionality is a keyword in C#, unlike how its an annotation in Java.
        public override void move()
        {
            Console.WriteLine("I am a car and I am moving");
        }

        public override void stop()
        {
            throw new NotImplementedException();
        }

        // IManualTransmission interface implementation
        public void ShiftDown()
        {
            Console.WriteLine("Shifting down");
        }

        public void ShiftUp()
        {
            Console.WriteLine("Shifting up");
        }
    }
}
