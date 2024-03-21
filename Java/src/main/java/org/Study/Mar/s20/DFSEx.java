package org.Study.Mar.s20;

import java.util.List;

class Edge {
    int adjvertex;
    public Edge(int v) {
        adjvertex = v;
    }
}

public class DFSEx {
    int N;
    List<Edge>[] graph;
    private boolean[] visited;
    public DFSEx(List<Edge>[] adjList) {
        N = adjList.length;
        graph = adjList;
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            visited[i]=false;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i] ){
                dfs(i);
            }
        }
    }
    private void dfs(int i) {
        visited[i] = true;
        System.out.print(i+" ");
        for (Edge e: graph[i] ) {
            if(!visited[e.adjvertex]) {
                dfs(e.adjvertex);
            }
        }

    }
}
