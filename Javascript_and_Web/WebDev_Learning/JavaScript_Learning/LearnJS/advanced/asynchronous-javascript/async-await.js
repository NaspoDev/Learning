/* 
async await
async await make proimses easier to write and work with.

Notes:
- async functions return a Promise
- await makes a function wait for a Promise. (can only be used inside async functions)
- if you're not creating the Promise in the function, you'll want to wrap it in a try catch block for error handling.
- Since async functions return a Promise, you can use .then and .catch on them.
*/

// bored API returns a random activity to do when you're bored.
const url = "https://www.boredapi.com/api/activity/";

async function getActivity() {
  try {
    const response = await fetch(url); // awaiting the fetch returned promise
    const data = await response.json(); // json() is also a promise so we await for that to resolve
    console.log(data["activity"]);
  } catch (error) {}
}

getActivity().then(() => {
  console.log("Done! Enjoy your activity!");
});
