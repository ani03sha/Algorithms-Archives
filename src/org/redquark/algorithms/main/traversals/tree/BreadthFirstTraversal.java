package org.redquark.algorithms.main.traversals.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Algorithm
 * <p>
 * 1) Create an empty queue q
 * 2} temp_node = root
 * 3)Loop while temp_node is not NULL
 * a)print temp_node->data.
 * b)Enqueue temp_node’s children(first left then right children)to q
 * c)Dequeue a node from q and assign it’s value to temp_node
 */
public class BreadthFirstTraversal {

    private static void levelOrder(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        Node temp = root;

        while (temp != null) {

            // Printing the data at the current node
            System.out.print(temp.data + " ");

            // Adding the left and right children of the current nodde to the queue
            queue.add(temp.left);
            queue.add(temp.right);

            // Deque frpm the queue and assign it to temp
            temp = queue.poll();
        }
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

        // Printing the Breadth First Traversal
        levelOrder(root);
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
