// An example Promise program to see if the user is wathcing YouTube, or if they are watching TikTok, or if they left their device entirely.

let userLeft = false;
let watchingTikTok = true;

function wathchingYouTube() {
  return new Promise((resolve, reject) => {
    if (userLeft) {
      reject("User Left :(");
    } else if (watchingTikTok) {
      reject("User is wathcing TikTok.");
    } else {
      resolve("User is watching YouTube!");
    }
  });
}

wathchingYouTube()
  .then((message) => console.log(message))
  .catch((message) => console.log(message));
