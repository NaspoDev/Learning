// Type Any

// We can assign any value to a variable of type any. Defeats the purpose of TS, try to avoid, but sometimes necessary.
let level; // type any (undefined variables are assumed type any)
level = 1;
level = "a";

// Example of when it might be necessary:
// We don't know the structure of the data we're getting back from the server.
function printData(data: any) {
  console.log(data);
}
