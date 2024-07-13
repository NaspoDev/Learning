package main.java.dev.naspo.designpatterns.behavioualpatterns.strategy;

import java.util.ArrayList;

// Working with our values, using strategy patterns.
// This way we can add and use additional strategies without changing the Values class.
public class Values {
    private int[] values;

    public Values(int[] values) {
        this.values = values;
    }

    public ArrayList<Integer> filterValues(FilterStrategy filterStrategy) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int val : values) {
            if (!(filterStrategy.removeValue(val))) {
                result.add(val);
            }
        }

        return result;
    }
}
