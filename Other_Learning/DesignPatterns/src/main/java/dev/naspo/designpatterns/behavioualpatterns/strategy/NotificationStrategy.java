package main.java.dev.naspo.designpatterns.behavioualpatterns.strategy;

// Defining a general strategy for sending notifications.
// This can be implemented in different ways.
public interface NotificationStrategy {

    void sendValue(String value);
}
