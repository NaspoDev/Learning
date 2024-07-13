package me.naspo.superman;

public class Main {

    public static void main(String[] args) {
        Car c = new Car();
        int speed = 50;
        Vehicle v = new Vehicle(speed);
        c.display();
        c.vroom();
    }
}
