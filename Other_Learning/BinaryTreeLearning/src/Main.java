import java.util.Random;

// Learning the binary tree data structure.
// Each node can only have 2 children.
public class Main {

    private static Random rand = new Random();

    public static void main(String[] args) {
        // Exercise:
        // 1. Make a random binary tree and assign random integers for their data values.
        // 2. Then traverse the binary tree to find the sum of the entire tree.

        // Create a binary tree.
        BinaryTree binaryTree = new BinaryTree(10, 50);
        System.out.println(binaryTree);

        // Sum of binary tree.
        System.out.println(findSum(binaryTree.getRootNode()));
    }

    // Traverse a binary tree and find the sum of the entire tree. (using recursion)
    public static int findSum(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }

        return rootNode.getData() + findSum(rootNode.getLeftChild()) + findSum(rootNode.getRightChild());
    }

}