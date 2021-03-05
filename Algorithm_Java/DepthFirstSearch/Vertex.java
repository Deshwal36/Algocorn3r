package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	String name;
	boolean visited;
	List<Vertex> adjList;
	
	
	
	public Vertex(String name) {
		this.name = name;
		this.adjList = new ArrayList<>();
	}

   public void addNeighbour(Vertex v) {
	   this.adjList.add(v);
   }

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public boolean isVisited() {
		return visited;
	}



	public void setVisited(boolean visited) {
		this.visited = visited;
	}



	public List<Vertex> getAdjList() {
		return adjList;
	}


	@Override
	public String toString() {
		return this.name;
	}

}
