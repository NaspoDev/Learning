package me.naspo.hashmaptut;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //First trial
        int a = 10;
        int b = 3;
        int c = 88;

        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy.get("c"));

        //Second trial
        HashMap<String, String> fun = new HashMap<String, String>();

        fun.put("Bobby", "FluffyP0nies");
        fun.put("HelloKittyFan21", "password123");
        System.out.println(fun);

        fun.remove("HelloKittyFan21");
        System.out.println(fun);

        fun.put("HelloKittyFan21", "password123");
        System.out.println(fun.containsValue("password123"));
        System.out.println(fun.containsValue("password124"));
        System.out.println(fun.containsKey("Bobby"));

        fun.replace("Bobby", "pinkP0nies");
        System.out.println(fun.get("Bobby"));

        System.out.println(fun.keySet());
        System.out.println(fun.values());
    }

}
