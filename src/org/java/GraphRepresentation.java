package org.java;

public class GraphRepresentation {
    public static void main(String args[]){
        int[][] mat = new int[][]{
                {0,1,0,0,1},
                {1,0,1,0,1},
                {0,1,0,1,0},
                {0,0,1,0,1},
                {1,1,0,1,0}
        };

        Graph gr = new Graph(5);
        gr.addEdge(0,1);
        gr.addEdge(2,3);
        gr.addEdge(1,2);
        gr.addEdge(3,4);
        gr.addEdge(0,4);
        gr.addEdge(1,4);

        gr.printList();
        gr.bfs(0);
        gr.dfs(0);
    }
}
