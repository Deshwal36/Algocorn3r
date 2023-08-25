package BreadthFirstSearch;

import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        BFS bfs = new BFS();

        Vertex v1 = new Vertex(5);
        Vertex v2 = new Vertex(10);
        Vertex v3 = new Vertex(25);
        Vertex v4 = new Vertex(20);
        Vertex v5 = new Vertex(15);
        Vertex v6 = new Vertex(30);

        v1.setNeighbourList(List.of(v2, v3));
        v2.setNeighbourList(List.of(v4, v6));
        v3.setNeighbourList(List.of(v5));

        /*
         * 
         *        v1[5] {root node} || visited:Ture , queue : 5
         *        /   \
         *       /     \
         *   v2[10]    v3[25]
         *      / \       \ 
         *     /   \        \ 
         * v4[20]  v6[30]   v5[15]
         * 
         * BFS : 5->10->15->20->30->25
         * 
         */

        bfs.bfs(v1);

    }

}
