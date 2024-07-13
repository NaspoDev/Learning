package main.java.dev.naspo.doublylinkedlist;

public class DoublyLinkedListNode {

    private int data;
    private DoublyLinkedListNode prevNode;
    private DoublyLinkedListNode nextNode;

    public DoublyLinkedListNode(int data, DoublyLinkedListNode prevNode, DoublyLinkedListNode nextNode) {
        this.data = data;
        this.prevNode = prevNode;
        this.nextNode = nextNode;
    }

    // -- Getters and Setters ---

    // Data

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    // prevNode

    public DoublyLinkedListNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoublyLinkedListNode prevNode) {
        this.prevNode = prevNode;
    }

    // nextNode

    public DoublyLinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedListNode nextNode) {
        this.nextNode = nextNode;
    }
}
