package org.redquark.algorithms.main.traversals.tree;

/**
 * @author Anirudh Sharma
 */
public class DepthFirstTraversal {

    /**
     * Algorithm In-order(tree)
     * 1. Traverse the left subtree, i.e., call Inorder(left-subtree)
     * 2. Visit the root.
     * 3. Traverse the right subtree, i.e., call Inorder(right-subtree)
     */
    private static void inOrder(Node root) {

        // Base condition
        if (root == null) {

            return;
        }

        // First recur on the left child
        inOrder(root.left);

        // Print the root node
        System.out.print(root.data + " ");

        // Recur on the right child
        inOrder(root.right);
    }

    /**
     * Algorithm Pre-order(tree)
     * 1. Visit the root.
     * 2. Traverse the left subtree, i.e., call Preorder(left-subtree)
     * 3. Traverse the right subtree, i.e., call Preorder(right-subtree)
     */
    private static void preOrder(Node root) {

        // Base condition
        if (root == null) {
            return;
        }

        // Print the root node
        System.out.print(root.data + " ");

        // Recur on the left child
        preOrder(root.left);

        // Recur on the right child
        preOrder(root.right);
    }

    /**
     * Algorithm Postorder(tree)
     * 1. Traverse the left subtree, i.e., call Postorder(left-subtree)
     * 2. Traverse the right subtree, i.e., call Postorder(right-subtree)
     * 3. Visit the root.
     */
    private static void postOrder(Node root) {

        // Base condition
        if (root == null) {
            return;
        }

        // Recur on the left child
        postOrder(root.left);

        // Recur on the right child
        postOrder(root.right);

        // Print the root node
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        // Creating the tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Printing the in order traversal
        System.out.println("In Order traversal of tree");
        inOrder(root);

        // Printing the pre order traversal
        System.out.println("\nPre Order traversal of tree");
        preOrder(root);

        // Printing the post order traversal
        System.out.println("\nPost Order traversal of tree");
        postOrder(root);

    }

    // Node class for each node of a tree
    static class Node {

        // Data to be stored in the tree
        private int data;

        // Left child of a node
        private Node left;

        // Right child of a node
        private Node right;

        Node(int data) {

            // Initialization
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
