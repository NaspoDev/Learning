package main.java.dev.naspo.datastructureslearning;

import java.util.*;

// Data Structures: Ways to structure your data.
public class Main {

    public static void main(String[] args) {
        // === Array ===
        // Standard Java Array
        int[] array = new int[5];
        int[] array2 = {1, 2, 3, 4, 5};

        // === ArrayList ===
        // A wrapper class for the standard array. Basically arrays but better.
        // Much more versatile with lots of different methods.
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2, 1);
        // bunch of other methods to use...

        // === LinkedList ===
        // Values connected with pointers. Each value knows its neighbours.
        // Order matters in this list.
        // Very similar to ArrayList.
        // Faster to add and remove elements compared to ArrayList, but slower to get data.
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Justin");
        linkedList.add("Jordan");
        linkedList.add("Nadia");
        linkedList.add("Laya");
        linkedList.add("Lauren");

        System.out.println(linkedList.getLast());
        linkedList.add(2, "David");

        // === HashMap ===
        // key : value pairs
        HashMap<String, Integer> peopleAndAges = new HashMap<>();

        peopleAndAges.put("Jack", 34);
        peopleAndAges.put("Mike", 45);
        peopleAndAges.put("Andy", 23);
        System.out.println(peopleAndAges);
        System.out.println("Jack is " + peopleAndAges.get("Jack") + " years old.");

        // == HashSet ==
        /*
        A HashSet is a collection of items where each item is unique.
        If you try to add an item that exists in the HashSet, it will
        be ignored.
        - Does not maintain order.

        When we put an object into a HashSet, it uses the object’s
        hashcode value to determine if an element is not in the set already.
         */
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.contains(4));
        int setSize = set.size();

        // === Queue ===
        // First in, first out.
        // Based on LinkedLists.
        Queue<String> queue = new LinkedList<>();

        queue.add("Labi");
        queue.add("Joy");
        queue.add("Ana");
        System.out.println(queue);

        // Remove the first person from the queue.
        queue.poll();
        System.out.println(queue);

        // peek() retrieves but does not remove the head element of the queue.
        System.out.println(queue.peek());

        // === Stack ===
        // Last in, first out.
        Stack<String> stack = new Stack<>();

        // push() adds an element to the stack. (Exact same as add())
        stack.push("Math Textbook");
        stack.push("English Textbook");
        stack.push("History Textbook");
        System.out.println(stack);

        // removes the element at the top of the stack.
        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek()); // see the element at the top of the stack
        stack.set(1, "Geography Textbook"); // you can also change certain items in the stack at an index
        System.out.println(stack);
    }
}