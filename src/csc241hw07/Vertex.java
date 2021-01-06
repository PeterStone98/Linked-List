/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Pete
 */
public class Vertex {

    int value;
    ArrayList<Vertex> adjacent = new ArrayList<Vertex>();

    public Vertex(int v) {
        value = v;
    }

    public void addEdge(Vertex v) {
        adjacent.add(v);
    }

    public void depthFirstSearch() {
        // create an empty "visited" list
        List<Vertex> visited = new ArrayList<Vertex>();
        // start the recursive depth first search on the current vertex
        this.dfs(visited);
    }

    private void dfs(List<Vertex> visited) {
        // visit this node
        System.out.print("[" + value + "]");
        // add it to visited
        visited.add(this);

        // recursively visit each adjacent node
        for (Vertex v : adjacent) {
            if (!visited.contains(v)) {
                // vertex has not yet been visited
                v.dfs(visited);
            }
        }
    }

    public void breadthFirstSearch() {
        List<Vertex> visit = new ArrayList<Vertex>();
        // start the recursive depth first search on the current vertex
        this.bfs(visit);
        System.out.println();
    }

    private void bfs(List<Vertex> visit) {
        Queue<Vertex> q = new LinkedList<>();
        ArrayList<Vertex> explored = new ArrayList<>();

        q.add(this);
        explored.add(this);
        

        while (!q.isEmpty()) {

            Vertex current = q.remove();
            if (current.adjacent.isEmpty()) {
                System.out.print("[" + current.value + "]");
                break;
            } else {
                for (Vertex vertex : current.adjacent) {
                    if (!explored.contains(vertex)) {
                        q.add(vertex);
                        explored.add(vertex);
                    }
                }
                explored.add(current);
                System.out.print("[" + current.value + "]");
            }

        }

    }

  

    @Override
    public String toString() {
        return "[" + value + "]";
    }

}
