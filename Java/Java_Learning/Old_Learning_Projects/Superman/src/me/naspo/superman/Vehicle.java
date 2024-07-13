package me.naspo.superman;

public class Vehicle {

    int maxSpeed = 120;

    Vehicle() {
        System.out.println("Vehicle constructor.");
        System.out.println(maxSpeed);
    }

    Vehicle(int maxSpeed) {
        System.out.println("Vehicle constructor w/ speed");
        this.maxSpeed = maxSpeed;
        System.out.println(maxSpeed);
    }

    public void vroom() {
        System.out.println("Vroom vroom");
    }

}
