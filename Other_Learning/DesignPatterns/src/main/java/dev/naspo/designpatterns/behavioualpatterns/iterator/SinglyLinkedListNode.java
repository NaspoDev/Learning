package main.java.dev.naspo.designpatterns.behavioualpatterns.iterator;

public class SinglyLinkedListNode {
    private int data;
    private SinglyLinkedListNode nextNode;

    public SinglyLinkedListNode(int data) {
        this.data = data;
        this.nextNode = null;
    }

    // -- Getters and Setters ---

    // Data

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    // nextNode

    public SinglyLinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(SinglyLinkedListNode nextNode) {
        this.nextNode = nextNode;
    }
}
