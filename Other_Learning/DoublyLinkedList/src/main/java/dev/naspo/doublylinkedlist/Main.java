package main.java.dev.naspo.doublylinkedlist;

/*
Learning about Doubly Linked Lists

Each element in the list has a pointer to the one before and after it.
 */

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addNode(1);
        list.addNode(10);
        list.addNode(25);
        System.out.println(list);
    }
}