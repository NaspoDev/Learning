package main.java.dev.naspo.designpatterns.behavioualpatterns.strategy;

// Defining a general strategy for filtering values.
// This can be implemented in different ways.
public interface FilterStrategy {

    boolean removeValue(int value);
}
