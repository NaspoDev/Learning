package main.java.dev.naspo.designpatterns.behavioualpatterns.strategy;

public class RemoveOddStrategy implements FilterStrategy {

    @Override
    public boolean removeValue(int value) {
        if (value % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
