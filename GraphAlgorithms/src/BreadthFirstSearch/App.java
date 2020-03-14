package BreadthFirstSearch;

public class App {

	public static void main(String[] args) throws Exception {
             BFS bfs=new BFS();
             
             Vertex v1=new Vertex(5);
             Vertex v2=new Vertex(10);
             Vertex v3=new Vertex(15);
             Vertex v4=new Vertex(20);
             Vertex v5=new Vertex(25);
             Vertex v6=new Vertex(30);
	
             v1.addNeighbourVertex(v2);
             v1.addNeighbourVertex(v3);
             v2.addNeighbourVertex(v4);
             v2.addNeighbourVertex(v6);
             v3.addNeighbourVertex(v5);
             //System.out.println(v1);
             
             bfs.bfs(v1);
             
             
             
	}

}
