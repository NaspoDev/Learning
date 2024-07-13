// Enums
// (Enums should be in PascalCase)

const enum Size {
  Small,
  Medium,
  Large,
}
// By default, enums begin numbering their members starting at 0. (Small = 0, Medium = 1, Large = 2)
// You can change this by manually setting the value of one of its members. For example:
enum Size2 {
  Small = 1,
  Medium,
  Large,
}

let mySize: Size = Size.Small;
console.log(mySize); // prints 0

// TIP! If you set your enums as const, the compiler will generated more optimizes js code.
// You can see the comparison in the compiled enums.js. Size is const and Size2 is not.
