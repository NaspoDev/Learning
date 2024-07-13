package me.naspo.interfaces;

public interface Series {

    int MAX = 10;
    String errorMsg = "Cannot go above " + MAX;

    int getNext();

    default void printStuff() {
        System.out.println("Live from New York!");
    }

    private void printMoreStuff() {
        System.out.println("More stuff.");
    }
}
