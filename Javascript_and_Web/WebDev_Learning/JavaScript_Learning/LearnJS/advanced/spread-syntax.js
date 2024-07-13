// spread syntax

// Example #1
const pokemon = { name: "Pikachu" };
const stats = { hp: 40, attack: 60, defense: 45 };

// say we want to combine these to a new object, in order.
// method 1
const lvl10 = Object.assign(pokemon, stats);
console.log(lvl10);
// method 2
const lvl11 = { ...pokemon, ...stats };
console.log(lvl11);

// Example #2
let fruits = {
  apple: 20,
  orages: 30,
  strawberries: 10,
};

// say we want to add a value to the beginning of the list, while preserving the orders
fruits = { ...{ blueberries: 15 }, ...fruits };
console.log(fruits);

// Example #3, Spread syntax with Arrays
// say we want to add three more languages to the list...

// bad way:
let languages = ["English", "French", "Greek"];
languages.push("Cantonese");
languages.push("German");
languages.push("Italian");

// better way:
languages = ["English", "French", "Greek"];
languages = [...languages, "Cantonese", "German", "Italian"];
console.log(languages);

// shifting arrays with spread syntax
languages = ["English", "French", "Greek"];
languages = ["Cantonese", "German", "Italian", ...languages];
console.log(languages);
