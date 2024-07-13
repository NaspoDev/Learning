// Arrays

// Typed array
let numbers: number[] = [1, 2, 3];
let numbers2 = [1, 2, 3]; // type inference also works with arrays

// Any array
// If you want/need an array with mixed types, you can use the any type.
let myValues: any[] = [1, 2, "3"];
let myValues2 = [1, 2, "3"];
let myValues3 = []; // TS will infer the type any[] for empty, undefined arrays
