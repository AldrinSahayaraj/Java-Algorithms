package org.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public Graph(int val){
        for(int i=0; i<val; i++){
            list.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }

    public void printList(){
        for(int i=0; i<list.size(); i++){
            System.out.println("Adj List of vertex : "+i);
            for(int j=0; j<list.get(i).size(); j++){
                System.out.println(" " + list.get(i).get(j));
            }
        }
    }

    public void bfs(int vertex){
        System.out.println();
        int size = list.size();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        boolean[] visited = new boolean[size];
        visited[vertex] = true;

        while(!queue.isEmpty()){
            int V = queue.remove();
            System.out.print(V +" ");
            for(int i=0; i<list.get(V).size(); i++){
                int av = list.get(V).get(i);
                if(!visited[av]){
                    queue.add(av);
                    visited[av]=true;
                }
            }
        }
    }

    public void dfs(int vertex){
        boolean[] visited = new boolean[list.size()];
        System.out.println();
        dfs2(vertex, visited);
    }

    public void dfs2(int vertex, boolean[] visited){
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for(int i=0; i< list.get(vertex).size(); i++){
            int av = list.get(vertex).get(i);
            if(!visited[av])
                dfs2(av, visited);
        }
    }
}
