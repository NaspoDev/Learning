// Objects

// An "object" in JS is a set of key-value pairs
// Can hold any combination of variable types
// {} curly braces means defining an object literal
let person = {
  name: "Athanasios",
  age: 18,
};
console.log(person);
console.log(typeof person);

// can use either dot noataion or square brackets to access and work with values
person.age = 19;
console.log(person.age);
console.log(person["name"]);
