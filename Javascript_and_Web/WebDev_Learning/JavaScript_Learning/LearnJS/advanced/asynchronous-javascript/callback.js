// Callback
// Have a function call antother function when it is done doing what it needs to do.

let pizza = undefined;

function makePizza(callback) {
  // "callback" can be called whatever you want. It's the function we are passing in to call back.
  setTimeout(() => {
    const pizza = "🍕";
    callback(pizza);
  }, 2000);
}

function pizzaReady(pizza) {
  console.log(`${pizza} is ready, eat it!`);
}

makePizza(pizzaReady); // pass in the callback function without brackets.

/*
CALLBACK HELL:
Callback hell occurs when you have mutliple things that need to wait on eachother in order.
It creates lots of hastle and mess to create all these call backs. It is better to use Promises or async await. 
*/
