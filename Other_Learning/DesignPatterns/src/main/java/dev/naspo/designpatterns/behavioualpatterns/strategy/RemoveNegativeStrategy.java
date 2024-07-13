package main.java.dev.naspo.designpatterns.behavioualpatterns.strategy;

public class RemoveNegativeStrategy implements FilterStrategy {

    @Override
    public boolean removeValue(int value) {
        if (value < 0) {
            return true;
        } else {
            return false;
        }
    }
}
