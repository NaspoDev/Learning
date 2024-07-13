package me.naspo.interfaces;

public class ByTwos implements Series {

    int val;

    ByTwos() {
        val = 0;
    }

    @Override
    public int getNext() {
        if (val >= MAX) {
            System.out.println(errorMsg);
        } else {
            val += 2;
        }
        return val;
    }
}
