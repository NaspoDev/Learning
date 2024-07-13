package main.java.dev.naspo.designpatterns.behavioualpatterns.observer;

public class YoutubeUser implements Subscriber {

    private String username;

    public YoutubeUser(String username) {
        this.username = username;
    }

    @Override
    public void sendNotification(String event) {
        System.out.println("Notification received: " + event);
    }

    public String username() {
        return username;
    }
}
