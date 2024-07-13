// Anonymous Arrow Functions
// Shortening the syntax when it comes to passing an anynymous function, a function with no name, into a another function.

document.addEventListener("click", function () {
  console.log("click");
});

// becomes...

document.addEventListener("click", () => {
  console.log("click");
});

// shorter...

document.addEventListener("click", () => console.log("click"));
