// The "this" keyword works differently in an arrow function compared to a regular function.

class Person {
  constructor(name) {
    this.name = name;
  }

  // Print out name after 100ms
  printNameFunction() {
    setTimeout(function () {
      console.log("With Regular Function: " + this.name);
    }, 100);
  }

  // Print out name after 100ms
  printNameArrow() {
    setTimeout(() => {
      console.log("With Arrow Function: " + this.name);
    }, 100);
  }
}

let person = new Person("Bob");
person.printNameFunction();
person.printNameArrow();
console.log(this.name);

/*
Notes:
- In printNameFunction(), the regular function handler for setTimeOut() redefines the name variable with the "this" keyword.
- In printNameArrow(), the arrow function handler for setTimeOut() does not redefine the name variable, so it calls from the Pesron class. (The scope is preserved).
- That is why printNameArrow() works as indeted and printNameFunction() does not.
*/
