package dev.naspo;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Learning how to make HTTP requests in Java using Java's built-in HTTPClient API.
// Using this free Dogs API: https://dog.ceo/dog-api/
public class Main {
    public static void main(String[] args) {
        // Create an HTTPClient. This is used to send requests and receive their responses.
        HttpClient client = HttpClient.newHttpClient();

        // Build the request that the client will send with an HTTPRequest Builder.
        // In this case, we want to make a GET request to the dogs API to get a random dog image.
        // Note that GET is the default, so we don't need to chain a .GET() method in this case.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dog.ceo/api/breeds/image/random"))
                .build();

        /*
        Default network request behaviour: Synchronous.
        You'll notice that Java doesn't need to use anything like async/await when making network requests.

        This is because the default behaviour for network requests in Java is to be synchronous, meaning the code WILL
        block and wait for the response before continuing.
        This is okay because Java is multithreaded by design. If you don’t want to block the main thread, you can run
        the request on a different thread (or use async APIs).

        By comparison, a language like Javascript needs to use async/await as the default behaviour for network
        requests in Javascript is asynchronous. This is because JavaScript runs on a single-threaded event loop, and it
        can't afford to block while waiting for a network response.
         */
        try {
            // An HTTP Response will house the response that the client receives.
            // client.send() uses a response body handler to tell Java how to read the response body. In this
            // case: .ofString() means we want the response as a plain String.
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status code: " + response.statusCode());
            System.out.println("Response body: " + response.body());

            /*
            JSON Deserialization:
            Since we are expecting a JSON response, we'd probably want to work with that instead of a string.
            To do that, we'd need to deserialize the JSON string in our response into a Java object.
            Java doesn't have a native JSON library, so we have to use an external library. `gson` from Google is good.
             */
            Gson gson = new Gson();
            DogPhoto dogPhoto = gson.fromJson(response.body(), DogPhoto.class);
            System.out.println(dogPhoto.message);

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
