package org.redquark.algorithms.traversals.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * Depth First Traversal (or Search) for a graph is similar to Depth First Traversal of a tree.
 * The only catch here is, unlike trees, graphs may contain cycles, so we may come to the same node again.
 * To avoid processing a node more than once, we use a boolean visited array.
 */
public class DepthFirstTraversal {

    // Adjacency List of the graph
    private static List<Integer>[] adjacencyList;

    // Number of vertices in a graph
    private static int vertices;

    private static void dfs() {

        // Visited array
        boolean[] visited = new boolean[vertices];

        Arrays.fill(visited, false);

        // Call the helper function recursively
        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                // Recursive call
                dfs(i, visited);
            }
        }
    }

    private static void dfs(int i, boolean[] visited) {

        // Make the current node as visited
        visited[i] = true;

        // Print the current node
        System.out.print(i + " ");

        // Recur for all adjacent vertices

        for (int data : adjacencyList[i]) {

            if (!visited[data]) {
                dfs(data, visited);
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

        // Print the BFS traversal of a graph
        System.out.println("Depth First Traversal of a graph is as follows:");
        dfs();
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
