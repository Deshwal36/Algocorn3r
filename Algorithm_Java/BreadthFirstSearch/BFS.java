package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public void bfs(Vertex root) {

		Queue<Vertex> queue = new LinkedList<>();
		root.setVisited(true);
		queue.add(root);

		while (!queue.isEmpty()) {

			Vertex actualVertex = queue.remove();
			System.out.println(actualVertex + " ");

			for (Vertex v : actualVertex.getNeighbourList()) {

				if (!v.isVisited()) {
					v.setVisited(true);
					queue.add(v);

				}
			}

		}

	}

}
