// better loops

// say we have an array of orders, and we want to filter orders based on price, after tax, etc.
// we can create new arrays which add values from the orginial orders array, and add tax for example
// instead of making one big for loop and checking each condition, we can use three simple lines of code

// *note: arrow functions (=>) allow us to write shorter function syntax, and is what makes this entire thing special.

// *IMPORTANT NOTE: Writing one for loop would be much better for readability and execution. Here we are executing three loops vs one.
// The only upside is that it takes less lines of code. If performance matters or you are dealing with lots of values, use traditional loops.

const orders = [500, 19, 35, 293, 39, 32, 55];

// total of all the orders
const total = orders.reduce((acc, cur) => acc + cur);

// all order prices with tax added
const withTax = orders.map((value) => value * 1.13);

// filter orders greater than 100
const highValue = orders.filter((value) => value > 100);

console.log(orders);
console.log(total);
console.log(withTax);
console.log(highValue);
