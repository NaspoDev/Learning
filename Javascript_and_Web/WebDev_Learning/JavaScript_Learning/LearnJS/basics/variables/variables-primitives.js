// Rules for variable naming:
// camelCase is practice for naming variables
// names cannot start with a number

// --- BASIC VARIABLES TESTING & EXAMPELS ---
console.log("--- BASIC VARIABLES TESTING & EXAMPELS ---\n");
// declare a normal variables with "let"
let userName = "Naspo";
console.log(userName);
// dynamiclly-typed language
let number = 1;

// const (delcare constant variables)
// constant variables cannot be redeclared, but can still be added to.
const email = "example@domain.com";
console.log(email);
try {
  email = "test";
} catch (error) {
  console.log("Error! Cannot redeclare a constant variable.");
}

// Primitives: String, Number, Boolean, undefined, null
let myName = "Athanasios";
let age = 18; // no such thing as int or float, all numbers are of type "number"
let isApproved = false;
let firstName = undefined; // its type is technically also "undefined"
let lastName = null; // its type is technically "object" because we use null to excplicitly clear the value of a variable.

// --- OTHER ---
console.log("\n--- OTHER ---\n");
// typeof operator
console.log(typeof userName);
