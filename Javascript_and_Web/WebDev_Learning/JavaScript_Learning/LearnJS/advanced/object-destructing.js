// object destructing

// how to feed bob?
const turtle = {
  name: "Bob 🐢",
  legs: 4,
  shell: true,
  type: "amphibious",
  meal: 10,
  diet: "berries",
};

// method 1 (basic)
function feed(animal) {
  console.log(`Feed ${animal.name} ${animal.meal} kilos of ${animal.diet}`);
}
feed(turtle);

// method 2 (object destructuring)
// it will destructure the needed variables from the object we pass in
function feed2({ name, meal, diet }) {
  console.log(`Feed ${name} ${meal} kilos of ${diet}`);
}
feed2(turtle);
