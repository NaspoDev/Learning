package main.java.dev.naspo.designpatterns;

import main.java.dev.naspo.designpatterns.behavioualpatterns.iterator.SinglyLinkedList;
import main.java.dev.naspo.designpatterns.behavioualpatterns.observer.YoutubeChannel;
import main.java.dev.naspo.designpatterns.behavioualpatterns.observer.YoutubeUser;
import main.java.dev.naspo.designpatterns.behavioualpatterns.strategy.RemoveNegativeStrategy;
import main.java.dev.naspo.designpatterns.behavioualpatterns.strategy.RemoveOddStrategy;
import main.java.dev.naspo.designpatterns.behavioualpatterns.strategy.Values;
import main.java.dev.naspo.designpatterns.creationalpatterns.builder.Burger2;
import main.java.dev.naspo.designpatterns.creationalpatterns.builder.BurgerBuilder;
import main.java.dev.naspo.designpatterns.creationalpatterns.factory.Burger;
import main.java.dev.naspo.designpatterns.creationalpatterns.factory.BurgerFactory;
import main.java.dev.naspo.designpatterns.creationalpatterns.singleton.App;
import main.java.dev.naspo.designpatterns.structuralpatterns.adpater.MicroToUsbAdapter;
import main.java.dev.naspo.designpatterns.structuralpatterns.adpater.MicroUsbCable;
import main.java.dev.naspo.designpatterns.structuralpatterns.adpater.UsbCable;
import main.java.dev.naspo.designpatterns.structuralpatterns.adpater.UsbPort;

// Learning fundamental programming design patterns.
public class Main {
    public static void main(String[] args) {
        /*
        There are 8 design patterns:
        Factory, Builder, Singleton, Observer, Iterator, Strategy, Adapter, Facade

        Within these, they can be divided into 3 categories:
            1. Creational patterns
            2. Behavioural patterns
            3. Structural patterns
         */

        System.out.println("Learning Design Patterns");

        // 1. Factory
        // The factory pattern is a creational pattern that uses a factory class to create objects.
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger cheeseBurger = burgerFactory.createCheeseBurger();
        Burger veggieBurger = burgerFactory.createVeggieBurger();
        Burger deluxeBurger = burgerFactory.createDeluxeBurger();

        // 2. Builder
        // The builder pattern is a creational pattern that allows the construction of an object step by step.
        // We don't have to pass in all the ingredients at once.
        Burger2 myBurger = new BurgerBuilder()
                .setBun("Sesame")
                .setCheese("Cheddar")
                .setPatty("Beef")
                .build();

        // 3. Singleton
        // A singleton is a class that can only have one instance of it instantiated.
        App app1 = App.getAppState();
        System.out.println(app1.isLoggedIn()); // false

        App app2 = App.getAppState(); // this will return the same instance as app1
        app2.logIn();
        System.out.println(app1.isLoggedIn()); // true

        // 4. Observer (aka PubSub)
        // The observer pattern is a behavioural pattern that allows an object (the publisher) to notify
        // other objects (the subscribers) upon some action.
        YoutubeChannel channel = new YoutubeChannel("Naspo");
        channel.subscribe(new YoutubeUser("xXGamerXx"));
        channel.subscribe(new YoutubeUser("randomUser123"));
        channel.subscribe(new YoutubeUser("DanTheMan"));
        // We only have to call notify once and all the subscribers will be notified.
        channel.notify("New video uploaded!");

        // 5. Iterator
        // A behavioural pattern that defines how the values in an object can be iterated through.
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.iterate();

        // 6. Strategy
        // A behavioural pattern that allows you to define a family of algorithms, following the open-closed principle.
        // These algorithms can be implemented in different ways as needed.
        Values values = new Values(new int[]{-7, -4, -1, 0, 2, 6, 9});
        System.out.println(values.filterValues(new RemoveNegativeStrategy())); // [0, 2, 6, 9]
        System.out.println(values.filterValues(new RemoveOddStrategy())); // [-4, 0, 2, 6]

        // 7. Adapter
        // A structural pattern that allows incompatible interfaces to work together.
        UsbPort usbPort1 = new UsbPort();
        UsbCable usbCable1 = new UsbCable();
        usbPort1.plug(usbCable1);

        UsbPort usbPort2 = new UsbPort();
        MicroUsbCable microUsbCable = new MicroUsbCable();
        MicroToUsbAdapter adapter = new MicroToUsbAdapter(microUsbCable);
        usbPort2.plug(adapter);

        // 8. Facade
        // See README.md
    }
}
