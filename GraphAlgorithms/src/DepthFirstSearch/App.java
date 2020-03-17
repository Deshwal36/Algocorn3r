package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

        Vertex v1=new Vertex("v1");
        Vertex v2=new Vertex("v2");
        Vertex v3=new Vertex("v3");
        Vertex v4=new Vertex("v4");
        Vertex v5=new Vertex("v5");
        Vertex v6=new Vertex("v6");
        
        v1.addNeighbour(v2);
        v1.addNeighbour(v5);
        v2.addNeighbour(v4);
        v5.addNeighbour(v3);
        v5.addNeighbour(v6);
        
        List<Vertex> l = new ArrayList<>();
        
        l.add(v1);
        l.add(v2);
        l.add(v3);
        l.add(v4);
        l.add(v5);
        l.add(v6);
        
        DFS d=new DFS();
        d.DepthFirstSearch(l);
        
       
	}

}
