namespace LearningCSharp;

/*

Records are like they are in Java. 
They are ideal for representing Data Models.

They are intended for immutable data and value-based equality.
(Means it's data doesn't changed after creation, and equality is based on it's values, 
unlike classes which are reference-based).

Features:
- Value-based equality (two records with the same data are considered equal).
- Built-in ToString(), Equals(), and GetHashCode() implementations.
- Value

When to use records:
- You want to model data that doesn’t change after creation.
*/

// The values you define here are properties.
// They become public properties with {get; init; } accessors, meaning they have a getter and 
// can be set during initialization, but not changed after that.
internal record MyRecord(int Id, string Name)
{
}
