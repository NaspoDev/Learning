namespace LearningCSharp.Other;


/* 
const vs readonly variables

const Variables: 
- Compile-time constant: The value must be known at compile time.
- Implicitly static: You access it via the type, not an instance.
- Must be initialized at declaration.
- Cannot be assigned a non-constant value (like another variable or a method call).

readonly Variables:
- Runtime constant: The value is set at runtime, not compile time.
- Can be instance or static.
- Must be assigned either:
- At the point of declaration or
- In the constructor.

*/

internal class ReadonlyVsConst
{
    public const string MyConst = "test";
    public readonly string MyReadOnlyString;

    internal ReadonlyVsConst(string value)
    {
        MyReadOnlyString = value;
    }
}
