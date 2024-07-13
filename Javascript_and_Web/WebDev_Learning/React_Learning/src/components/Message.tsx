// Creating our first component

// Components are represented by functions. Using PascalCase for naming convention.
function Message() {
  // You can write any js logic in here, and return whatever html you want.
  const name = "Athanasios";
  // We can write any JavaScript expression in the curly braces within our html.
  return <h1>Hello {name}</h1>;
}

export default Message;
