// if statement
if (10 > 2) {
  console.log("True!");
} else {
  console.log("False");
}

// for loop
for (let i = 0; i < 5; i++) {
  console.log(i);
}

const nums = [1, 2, 3, 4, 5];
for (num of nums) {
  console.log(num);
}

// try catch
try {
  console.log("Code ran succesfully in try catch.");
} catch (error) {
  console.log("Error caught!");
}

// switch statement
let number = 2;
switch (number) {
  case 1:
    console.log("The number is 1.");
    break;
  case 2:
    console.log("the number is 2.");
    break;
  default:
    console.log("Default case.");
    break;
}

// while and do while
condition = true;
while (condition) {
  console.log("While loop!");
  condition = false;
}

do {
  console.log("Do While!");
} while (condition);
