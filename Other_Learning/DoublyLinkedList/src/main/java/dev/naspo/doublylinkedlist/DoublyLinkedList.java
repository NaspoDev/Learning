package main.java.dev.naspo.doublylinkedlist;

import java.util.ArrayList;
import java.util.Arrays;

public class DoublyLinkedList {

    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;
    private int listLength;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.listLength = 0;
    }

    public void addNode(int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data, null, null);

        // If there is no head, this new node is the start of our list. Set it to the head (and tail).
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // If there are existing nodes in our list, point our tail to the new node and vice versa,
            // then set it as tail.
            tail.setNextNode(newNode);
            newNode.setPrevNode(tail);
            tail = newNode;
        }

        // Finally, update the length variable.
        listLength++;
    }

    // Remove the first node with data that matches inputted param.
    public void removeNode(int data) {
        DoublyLinkedListNode nodeToRemove = getNode(data);

        // If there is no node with the target data, exit.
        if (nodeToRemove == null) {
            System.out.println("No node with that data exists.");
            return;
        }

        // To remove the node, we need to point it's prev and next to each-other, and remove its pointers.
        DoublyLinkedListNode prevNode = nodeToRemove.getPrevNode();
        DoublyLinkedListNode nextNode = nodeToRemove.getNextNode();

        // If there is no previous node, nodeToRemove is the head.
        if (prevNode == null && nodeToRemove == head) {
            // Set its next node as the head, and remove its previous node pointer.
            head = nextNode;
            nextNode.setPrevNode(null);

            // Or if there is no next node then it is the tail.
        } else if (nextNode == null && nodeToRemove == tail) {
            // Set its previous node as the tail, and remove its next node pointer.
            tail = prevNode;
            prevNode.setNextNode(null);

            // Otherwise this is a regular node in our list.
        } else {
            // Link nodeToRemove's previous node and next node.
            prevNode.setNextNode(nextNode);
            nextNode.setPrevNode(prevNode);
        }

        // Remove nodeToRemove's pointers.
        nodeToRemove.setPrevNode(null);
        nodeToRemove.setNextNode(null);
        // The node has been removed.

        // Finally, update the length variable.
        listLength--;
    }

    // Get the first node that matches the data.
    public DoublyLinkedListNode getNode(int targetData) {
        // Traverse the list to find the node.
        DoublyLinkedListNode current = head;

        while (current != null) {
            // Return the node with targetData once found.
            if (current.getData() == targetData) {
                return current;
            }

            current = current.getNextNode();
        }

        // If the node with targetData does not exist, return null.
        return null;
    }

    // -- Getters --

    public DoublyLinkedListNode getHead() {
        return head;
    }

    public DoublyLinkedListNode getTail() {
        return tail;
    }

    // Return the length of the list.
    public int length() {
        return listLength;
    }

    // Override toString method to print list elements.
    @Override
    public String toString() {
        ArrayList<Integer> nodeValues = new ArrayList<>();

        // If there is no list yet, exit.
        if (head == null) {
            return "Empty list.";
        }

        // Traverse the list and add all node values to the nodeValues list.
        DoublyLinkedListNode current = head;

        for (int i = 0; i < listLength; i++) {
            nodeValues.add(current.getData());
            current = current.getNextNode();
        }

        return Arrays.toString(nodeValues.toArray());
    }
}
