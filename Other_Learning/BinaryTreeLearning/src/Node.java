public class Node {

    private int data;
    private Node leftChild, rightChild;

    public Node(int data, Node leftChild, Node rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    // Getters

    public int getData() {
        return data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    // Setters

    public void setData(int data) {
        this.data = data;
    }

    public void setLeftChild(Node node) {
        this.leftChild = node;
    }

    public void setRightChild(Node node) {
        this.rightChild = node;
    }
}
