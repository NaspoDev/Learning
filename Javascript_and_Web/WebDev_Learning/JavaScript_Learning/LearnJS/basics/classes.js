// Classes

/* 
- constructor() is a reserved method name for classes, and is how you make constructors.
- Define class-scope variables in the constructor with this.variableName.
- Functions do not need a "function" keyword to be defined.
*/

class Car {
  constructor(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  printMake() {
    console.log(this.make);
  }

  printModel() {
    console.log(this.model);
  }

  printYear() {
    console.log(this.year);
  }
}

let sonata = new Car("Hyundai", "Sonata", "2015");
sonata.printMake();
sonata.printModel();
sonata.printYear();
