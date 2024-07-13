import java.util.Arrays;
import java.util.Random;

// Generates a binary tree based on some parameters passed in.
public class BinaryTree {

    private int amountOfNodes;
    private int maxNodeValue;

    private Node rootNode;
    private int[] values;
    private Random random;

    public BinaryTree(int amountOfNodes, int maxNodeValue) {
        this.amountOfNodes = amountOfNodes;
        this.maxNodeValue = maxNodeValue;
        random = new Random();

        // Acceptable value filtering for tree params.
        if (amountOfNodes <= 0) {
            System.out.println("Amount of nodes in the tree must be greater than 0.");
            return;
        }
        if (maxNodeValue <= 0) {
            System.out.println("Max node value must be greater than 0.");
            return;
        }

        // Generate int array with random values (to be used for nodes).
        values = new int[amountOfNodes];
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(maxNodeValue + 1);
        }

        // Call to generate binary tree.
        generateBinaryTreeFromArray(values, 0);
    }

    // Recursively generate a binary tree.
    /*
    We use the values array as a baseline for our node values, and for the amount of nodes/iterations.

    1. Upon each iteration, we create a new node and assign it a value in order from the array.
    We also set the children null for the constructor because we will set them manually later.

    2. We set the right and left children of the node we just created by passing in this function.
    This is the recursive part, it will create and return a node that will be the child of our first node.
    This process will repeat until our base case it triggered.

    We also have a clause to set the rootNode variable for our BinaryTree object if the node we are creating
    is the root node (i.e. if we are at index 0).
    */
    private Node generateBinaryTreeFromArray(int[] values, int index) {
        // Escape clause (base case).
        if (index >= values.length) {
            return null;
        }

        // Generation logic
        Node node = new Node(values[index], null, null);

        node.setLeftChild(generateBinaryTreeFromArray(values, 2 * index + 1));
        node.setRightChild(generateBinaryTreeFromArray(values, 2 * index + 2));

        // If this node is also the root node, set it as the root node.
        if (rootNode == null && index == 0) {
            rootNode = node;
        }

        return node;
    }

    // Getters

    public int getAmountOfNodes() {
        return amountOfNodes;
    }

    public int getMaxNodeValue() {
        return maxNodeValue;
    }

    public Node getRootNode() {
        return rootNode;
    }

    public int[] getValues() {
        return values;
    }

    // Override toString() method.
    @Override
    public String toString() {
        return "Root node value: " + rootNode.getData() + "\n" +
        "All node values: " + Arrays.toString(values);
    }
}
