// Promises

// Overview:
// A Promise is an object that acts as a placeholder for an ongoing event where a conclusion is not yet know.
// Promises can have two results. It is either completed, resoved; or it is failed, rejected.

// Use cases:
// Best used when you want to do something that could take some time, and dont want the rest of your program waiting on it.
// Ex. Downloading a large image from a server, waiting for a callback/redirect, etc...

// A Promise object contains the "Producing Code" and calls the "Consuming Code"
// Promise object takes an anonymous function as its parameter, with two parameters, a resolve and a reject method (can be called whatever you want).
let myPromise = new Promise((myResolve, myReject) => {
  // "Producing Code" (may take some time)
  let a = 1 + 2;

  if (a == 2) {
    myResolve("OK"); // when success (pass in a param or nothing at all)
  } else {
    myReject("Error"); // when failed (pass in a param or nothing at all)
  }
});

// "Consuming Code" (Must wait for a fulfilled promise)
// .then will be called if the promise is resolved.
// .catch will be called if the promise is rejected.
// .then and .catch take a function as its parameter, with one param, that param being the param of arg resolve/reject functions.
myPromise
  .then((value) => {
    console.log(`${value}: The math equation checks out!`);
  })
  .catch((value) => {
    console.log(`${value}: The math equation doesn't check out.`);
  });
