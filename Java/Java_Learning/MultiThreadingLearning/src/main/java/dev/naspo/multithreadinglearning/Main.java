package dev.naspo.multithreadinglearning;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Learning Multi-Threading in Java with Java Virtual Threads.
// (I've made in-depth notes on Virtual Threads (and multi-threading in general) in my learning docs, so
// I won't be explaining theory here).
public class Main {

    final static String API_URL = "https://dog.ceo/api/breeds/image/random";

    public static void main(String[] args) {
        /*
        The example I'm using here is making many network requests.
        Typically, you'd want to make each request on its own virtual thread.
        To manage these virtual threads, you'd use an ExecutorService like the one below.
         */
        // Create an ExecutorService that runs each submitted task in a new virtual thread.
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        // Making 100 network calls.
        for (int i = 0; i < 100; i++) {
            executor.submit(() -> makeRequest());
        }

        // Calls for an orderly shutdown where no new tasks can be submitted and waits for all submitted tasks
        // to execute.
        executor.shutdown();

        // Since the main thread will just stop after it mounts all the tasks, I'm going to
        // keep it alive so that we can see all these calls being executed.
        try {
            // awaitTermination() will block the current thread until all tasks have completed execution after a
            // shutdown request, or the timeout occurs, or the current thread is interrupted, whichever happens first.
            if (executor.awaitTermination(20, TimeUnit.SECONDS)) {
                System.out.println("All tasks completed successfully.");
            } else {
                System.out.println("Tasks took too long to complete :(");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // A function that makes a request to our dog image API.
    // (I don't explain network requests here, I have another learning project for that).
    public static void makeRequest() {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            System.out.println("Error when making the network request!");
            e.printStackTrace();
        }
    }
}
