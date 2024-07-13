package me.naspo.superman;

public class Car extends Vehicle {

    int maxSpeed = 100;

    Car() {
        System.out.println("Car constructor.");
    }

    public void display() {
        System.out.println(maxSpeed);
        System.out.println(super.maxSpeed);
    }

    public void vroom() {
        System.out.println("Skurrtt!");
        super.vroom();
    }
}
