package main.java.dev.naspo.designpatterns.behavioualpatterns.pubsub;

import java.util.ArrayList;

// The YouTube channel is the subject (aka publisher) that emits events to the subscribers.
public class YoutubeChannel {
    private String channelName;
    private ArrayList<YoutubeUser> subscribers;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
        this.subscribers = new ArrayList<>();
    }

    // Add a new subscriber.
    public void subscribe(YoutubeUser user) {
        subscribers.add(user);
    }

    // Notify all the subscribers of an event.
    public void notify(String event) {
        for (YoutubeUser user : subscribers) {
            user.sendNotification(event);
        }
    }

    public String channelName() {
        return channelName;
    }
}
