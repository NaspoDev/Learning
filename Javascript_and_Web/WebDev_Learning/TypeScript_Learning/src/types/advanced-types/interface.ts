// Interfaces allow you to define the structure of an object.

// Other Notes:
// - Interfaces can extend other interfaces.

interface Student {
  name: string;
  age: number;
  grade: number;
  courses: string[];
}

let student1: Student = {
  name: "John",
  age: 20,
  grade: 10,
  courses: ["Math", "Science"],
};

let student2: Student = {
  name: "Jane",
  age: 21,
  grade: 11,
  courses: ["English", "History"],
};
