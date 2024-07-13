// Optional Values

// Optional values are declared using the ? operator after the name of the parameter.
function greet(name: string, lastName?: string): void {
  console.log(`Hello ${name} ${lastName}`);
}

greet("John");
