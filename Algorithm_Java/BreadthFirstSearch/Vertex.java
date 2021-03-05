package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private int data;
	private boolean visited;
	private List<Vertex> neighbourList;
	
	public Vertex(int data) {
		this.data = data;
		this.neighbourList = new ArrayList<>();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}


	public void setVisited(Boolean visited) {
		this.visited=visited;
	}

	public boolean isVisited() {
		return visited;
	}
	
	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(List<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}
	
	public void addNeighbourVertex(Vertex vertex) {
		this.neighbourList.add(vertex);
		
	}
			

	
   @Override
   public String toString() {
	
	return (""+ this.data);
}




	
}
