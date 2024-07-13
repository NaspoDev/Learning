// Built-In Types

/*
JavaScript built-in types:
- number
- string
- boolean
- object
- null
- undefined

Typescript additions:
- any
- unknown
- never
- enum
- tuple
*/

// How to declare a variable in TS:
let a: number; // variable a is of type number

// Type Inference
// TS will infer the type based on the value. We don't always need to specify the type.
let sales: number = 110;
let sales2 = 110; // type inference.

// Other examples of type declarations:
let isValid: boolean = true;
let firstName: string = "John";
let age: number = 30;
