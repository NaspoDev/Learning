"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function kgToLbs(weight) {
    if (typeof weight === "string") {
        return parseFloat(weight) * 2.2;
    }
    return weight * 2.2;
}
console.log(kgToLbs(10));
console.log(kgToLbs("20"));
function greet(name) {
    if (name) {
        console.log("Hello, " + name.toUpperCase() + "!!");
    }
    else {
        console.log("Hello there!");
    }
}
greet(null);
