package DepthFirstSearch;

import java.util.List;

public class DFS {
	
    public void DepthFirstSearch(List<Vertex> vertexList) {
    	
    	for(Vertex v:vertexList) {
    		
    		if(!v.isVisited()) {
    			v.setVisited(true);
    			dfs(v);
    		}
    	}
    }

	private void dfs(Vertex v) {
		
		System.out.println(v + " ");
		for(Vertex vertex : v.getAdjList()) {
			if(!vertex.isVisited()) {
				vertex.setVisited(true);
				dfs(vertex);
			}
		}
		
		
	}

}
