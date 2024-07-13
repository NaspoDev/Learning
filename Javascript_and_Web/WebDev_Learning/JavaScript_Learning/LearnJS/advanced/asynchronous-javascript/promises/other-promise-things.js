// *For demonstration purposes, we are going to make it so that they only resolve.
const downloadVideo1 = new Promise((resolve, reject) => {
  resolve("Video 1 downloaded successfully.");
});

const downloadVideo2 = new Promise((resolve, reject) => {
  resolve("Video 2 downloaded successfully.");
});

const downloadVideo3 = new Promise((resolve, reject) => {
  resolve("Video 2 downloaded successfully.");
});

/* 
Promise.all()
Running multiple promises all together.

Because they all run together, the Consume Code for all the promises is run at the same time.
Even if one promise takes longer than the others, they will wait and they will all execute at the same time when they are all done.
*/

// Passing in multiple promises to Promise.all() in an array.
// It will then pass in an array with the messages of each promise.
Promise.all([downloadVideo1, downloadVideo2, downloadVideo3]).then((messages) =>
  console.log(messages)
);

/* 
Promise.race()
Running multiple promises all together, but only calls Consume Code for the promise that finishes first.
So, it only returns one object instead of an array of objects.
*/
Promise.race([downloadVideo1, downloadVideo2, downloadVideo3]).then((message) =>
  console.log(message)
);
