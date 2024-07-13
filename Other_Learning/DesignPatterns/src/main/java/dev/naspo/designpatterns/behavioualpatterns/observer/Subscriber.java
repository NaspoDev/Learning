package main.java.dev.naspo.designpatterns.behavioualpatterns.observer;

// Interface that defines the behavior of a subscriber.

// Technically we don't need to have an interface for this, or at
// least for this example, but we're displaying how a YoutubeUser would implement
// the Subscriber interface.
public interface Subscriber {
    // It has an abstract method that sends a notification to the subscriber.
    void sendNotification(String event);
}
