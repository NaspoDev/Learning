// The "this" keyword referes to an object.
// It works basically exactly like in Java.

/*
In an object method, this refers to the object.
Alone, this refers to the global object.
In a function, this refers to the global object.
In a function, in strict mode, this is undefined.
In an event, this refers to the element that received the event.
Methods like call(), apply(), and bind() can refer this to any object.
*/

// In this example, "this" referes to the person object.
const person = {
  firstName: "Athanasios",
  lastName: "Topaltsis",
  age: "18",
  fullName: function () {
    return this.firstName + " " + this.lastName;
  },
};

console.log(person.fullName());
