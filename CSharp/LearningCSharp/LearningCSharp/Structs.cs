using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LearningCSharp
{
    /* 
    A struct is a data structure that can be used to hold small data values that do not require inheritance.
    It supports constructors, constants, properties, fields, etc, but does not support inheritance.
    Even thought they support lots of things, they are primary used to define small data structures.

    *IMPORTANT NOTE: structs are value types, while classes are reference types. This means that structs are 
    *copied by value when they are passed around, while classes are copied by reference.
    */
    internal class Structs
    {
        // structs can be defined at the namespace level, or the class level.

        struct Coordinate
        {
            internal int x;
            internal int y;
        }

        internal void doSomething()
        {
            // structs can be initialized with or without the "new" keyword.

            // initialize with the new keyword
            Coordinate coords = new Coordinate();
            coords.x = 10;
            coords.y = 7;

            // initialize without the new keyword.
            Coordinate coords2;
            coords2.x = 3;
            coords2.y = 14;

            // both are valid!

            Console.WriteLine($"Coords 1: x = {coords.x}, y = {coords.y}");
            Console.WriteLine($"Coords 2: x = {coords2.x}, y = {coords2.y}");
        }
    }
}
