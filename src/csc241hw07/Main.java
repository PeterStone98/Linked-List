/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw07;

/**
 *
 * @author Pete
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vertex v1 = new Vertex(5);
        Vertex v2 = new Vertex(10);
        Vertex v3 = new Vertex(7);
        Vertex v4 = new Vertex(9);
        Vertex v5 = new Vertex(8);
        
//        v1.addEdge(v2);
//        v1.addEdge(v3);
//        v2.addEdge(v4);
//        v2.addEdge(v5);
        v1.addEdge(v2);
        v1.addEdge(v3);
        v2.addEdge(v3);
        v3.addEdge(v5);
        v4.addEdge(v1);
        v4.addEdge(v3);
        v5.addEdge(v2);
        v5.addEdge(v4);
        
       // v1.depthFirstSearch();
       // System.out.println();       
        v1.breadthFirstSearch();
        v2.breadthFirstSearch();
        v3.breadthFirstSearch();
        v4.breadthFirstSearch();
        v5.breadthFirstSearch();

    }

}
