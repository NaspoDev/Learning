export {};
// Union Types

// Union types allow us to define a variable with multiple types, using the "|" operator.
function kgToLbs(weight: number | string): number {
  if (typeof weight === "string") {
    return parseFloat(weight) * 2.2;
  }
  return weight * 2.2;
}

console.log(kgToLbs(10));
console.log(kgToLbs("20"));

// Usage with Null
function greet(name: String | null): void {
  if (name) {
    console.log("Hello, " + name.toUpperCase() + "!!");
  } else {
    console.log("Hello there!");
  }
}

greet(null);
