package org.redquark.algorithms.main.traversals.graph;

import java.util.*;

/**
 * @author Anirudh Sharma
 * <p>
 * Breadth First Traversal (or Search) for a graph is similar to Breadth First Traversal of a tree.
 * The only catch here is, unlike trees, graphs may contain cycles, so we may come to the same node again.
 * To avoid processing a node more than once, we use a boolean visited array.
 */
public class BreadthFirstTraversal {

    // Adjacency List of the graph
    private static List<Integer>[] adjacencyList;

    // Number of vertices in a graph
    private static int vertices;

    private static void bfs(int source) {

        // Visited array for each vertex
        boolean[] visited = new boolean[vertices];

        Arrays.fill(visited, false);

        // Creating a queue that will store the vertices when they are visited
        Queue<Integer> queue = new LinkedList<>();

        // Mark the current node as visited
        visited[source] = true;

        // Enqueue the node
        queue.add(source);

        // Loop until the queue is empty
        while (!queue.isEmpty()) {

            // Deque a vertex from the queue and print it
            System.out.print(queue.poll() + " ");

            // Get all the adjacent vertices of the node that is dequeued

            // Loop that will fill the visited array for the visites vertices
            for (int data : adjacencyList[source]) {

                if (!visited[data]) {
                    visited[data] = true;
                    queue.add(data);
                }
            }
        }
    }

    public static void main(String[] args) {

        vertices = 4;

        Graph graph = new Graph();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Enter the vertex from which you want to start");
        int source = new Scanner(System.in).nextInt();

        // Print the BFS traversal of a graph
        System.out.println("Breadth First Traversal of a graph is as follows:");
        bfs(source);
    }

    static class Graph {

        Graph() {

            // Size of the array as number of vertices
            adjacencyList = new LinkedList[vertices];

            // Create a new list for each vertex such that adjacent nodes can be stored
            for (int i = 0; i < vertices; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        private void addEdge(int source, int destination) {

            // Add an edge from source to destination
            adjacencyList[source].add(destination);

            // Since the graph is undirected, add from destination to source also
            adjacencyList[destination].add(source);
        }
    }
}
