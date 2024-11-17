package main.java.dev.naspo.designpatterns.behavioualpatterns.strategy;

public class OrderService {

    // Creates and order and notifies the customer.
    public void createOrder(String orderDetails, NotificationStrategy notificationStrategy) {
        System.out.println("creating order...");
        System.out.println("Sending notification to customer...");
        notificationStrategy.sendValue("Order of " + "\"" + orderDetails + "\"" + " has been created and its on it's way!");
    }
}
