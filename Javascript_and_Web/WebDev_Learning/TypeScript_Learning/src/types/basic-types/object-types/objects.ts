// Objects

// Defining an employee object, where every employee has an id (that is a number) and a name (that is a string).
// The id is readonly, so it can't be changed after it is set. (Ex. employee.id = 2; wont work).
let employee: { readonly id: number; name: string } = { id: 1, name: "John" };

/* Defining a object where the keys are strings and the values are functions that take no parameters and return void.

The "[key: string]" syntax is the key definition inside square brackets. 
- It specifies that the keys of this object are strings and that you can use any string as a key. 
- id is just a placeholder name; you can use any name you like here.
- It's this syntax that allows you to have as many keys as you want in the object, with whatever names you want.

"key" can be any name you want. */
const buttonHandlers: { [key: string]: () => void } = {
  "button-1": () => console.log("Clicked button 1"),
  "button-2": () => console.log("Clicked button 2"),
};
