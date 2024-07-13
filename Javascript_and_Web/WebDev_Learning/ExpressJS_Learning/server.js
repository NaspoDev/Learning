// The heart of our backend. This is where we will write the server code.

const express = require("express"); // importing express
const app = express(); // creating our express application
const port = 3000; // conventional port

// Creating a route at our root. "/"
// First param is the path for our route. Our root path "/"
// Second param is a function, which takes in two params: request, and a response. (You can call these whatever you want).
// The req object represents the HTTP request and has properties for the request query string, parameters, body, and HTTP headers.
// The res object represents the HTTP response that an Express app sends when it gets an HTTP request.
app.get("/", (req, res) => {
  res.send("Hello World!");
  // typically this is where you serve your HTML file
});

// app.listen(port, [host], [backlog], [callback]])
// port: A port number on which the server should accept incoming requests.
// host: Name of the domain. You need to set it when you deploy your apps to the cloud.
// backlog: The maximum number of queued pending connections. The default is 511.
// callback: An asynchronous function that is called when the server starts listening for requests.

// Starts the server and listens for connections on port 3000.
app.listen(port, () => {
  console.log(`We are listening on port ${port}.`);
});
