package me.naspo.interfaces;

public class Main {
    public static void main(String[] args) {

        ByTwos byTwos = new ByTwos();
        ByThrees byThrees = new ByThrees();

        Series ob;

        System.out.println("ByTwos:");
        for (int i = 0; i < 6; i++) {
            ob = byTwos;
            System.out.println(ob.getNext());
        }

        System.out.println("By Threes:");
        for (int i = 0; i < 5; i++) {
            System.out.println(byThrees.getNext());
        }

        System.out.println("Other:");
        byTwos.printStuff();
    }
}
