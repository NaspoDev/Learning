// Arrow Functions
// Arrow functions allow us to write shorter function syntax.

// --- Example 1: ---

function sum(a, b) {
  return a + b;
}

// becomes...

let sum2 = (a, b) => {
  return a + b;
};

// shorter...

let sum3 = (a, b) => a + b;

/*
Notes:
- We need to create a variable to store our arrow function. (Normal functions already do this w/ the "function" keyword).
- Arrow functions assume to return automatically if it's only doing one thing. That way we don't need curly braces or return statement as seen in sum3.
*/

// --- Example 2 ---

function isPositive(number) {
  return number >= 0;
}

// becomes...

let isPositive2 = (number) => number >= 0;

/*
Notes:
- When our function only has one parameter, we can remove the parenthases, but its best practice and more readable to leave them.
*/

// --- Example 3 ---

function randomNumber() {
  return Math.random();
}

// becomes...

let randomNumber2 = () => Math.random();
