package main.java.dev.naspo.designpatterns.behavioualpatterns.strategy;

// SMSService implements the NotificationStrategy, making it a notification strategy.
// It will just take in the message and handle it as needed.
public class SMSService implements NotificationStrategy {

    @Override
    public void sendValue(String value) {
        System.out.println(value + " was just sent to the receiver via SMS!");
    }
}
