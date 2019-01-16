package org.redquark.algorithms.sorting;

/**
 * @author Anirudh Sharma
 */
public class TreeSort {

    // Root node of the BST
    private Node root;

    private void insertNode(int data) {

        root = insert(root, data);
    }

    private Node insert(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    private int inOrder(Node root, Integer[] arr, int index) {

        if (root == null) {
            return index;
        }

        index = inOrder(root.left, arr, index);
        arr[index++] = root.data;
        index = inOrder(root.right, arr, index);

        return index;
    }

    public Integer[] sort(Integer[] arr) {

        for (Integer integer : arr) {
            insertNode(integer);
        }

        inOrder(root, arr, 0);

        return arr;
    }

    // This class represents each node in the BST
    private class Node {

        private int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
