package me.naspo.interfaces;

public class ByThrees implements SeriesSub {

    int val;

    ByThrees() {
        val = 0;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public int getPrev() {
        return val -= 2;
    }
}
