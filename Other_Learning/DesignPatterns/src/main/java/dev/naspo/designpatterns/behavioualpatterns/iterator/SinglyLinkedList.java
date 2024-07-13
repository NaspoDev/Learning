package main.java.dev.naspo.designpatterns.behavioualpatterns.iterator;

// An example of an iterator is iterating through a binary tree, or a linked list.
// A very simple example of an iterator is iterating through an array.
// Technically, for (String s : myArray) is an iterator. It uses the built-in iterator in Java.

// In this example we will create a singly linked list and iterate through it.
public class SinglyLinkedList {
    private SinglyLinkedListNode head;
    private SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addNode(int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    // Iterates through the list and prints the data of each node.
    public void iterate() {
        SinglyLinkedListNode current = head;

        while (current != null) {
            System.out.println(current.getData());
            current = current.getNextNode();
        }
    }
}
