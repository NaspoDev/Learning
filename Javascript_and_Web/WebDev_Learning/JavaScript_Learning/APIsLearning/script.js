/* 
Request:
- Request is an API request, structured with a URL, method, headers, and body.
- Can be passed into the fetch function.

fetch():
- The fetch() method starts the process of fetching a resource from a server.
- The fetch() method returns a Promise that resolves to a Response object.

Other Notes:
- if you don't specify a method, it will default to GET.

Useful resources:
- https://reqres.in/ is a fake api website to test apis
- http://worldtimeapi.org is an api to get times around the world
*/

// Example 1: Simple GET request
async function getUsers() {
  const response = await fetch("https://reqres.in/api/users?page=2");
  const data = await response.json();
  console.log(data);
}

getUsers();

// Example 2: GET request with Request object
const user = "a.topaltsis";
const url = `https://api.spotify.com/v1/me/playlists`; // url to get user's playlists

const request = new Request(url, {
  method: "GET",
  headers: {
    Authorization: "Bearer exampletoken",
  },
});

async function getPlaylists() {
  const response = await fetch(request);
  const data = await response.json();
  console.log(data);
}

// Example 3: POST request with Request object

const url2 = "https://reqres.in/api/users?page=2";

const request2 = new Request(url2, {
  method: "POST",
  body: JSON.stringify({
    name: "Naspo",
    job: "Developer",
  }),
});

async function postUser() {
  const response = await fetch(request2);
  const data = await response.json();
  console.log(data);
}

postUser();
