// Functions

// Specifying a function return type
function calculateTax(income: number): number {
  return income * 1.2;
}

// If you don't specify a return type, the compiler will infer it from the return statement.
// If the function doesn't return anything, it will be inferred as void.
// (You can see this by hovering over the function).

// It is best practice to always specify a return type.
