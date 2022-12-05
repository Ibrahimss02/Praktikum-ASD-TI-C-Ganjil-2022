package Graph;

import java.util.ArrayList;

public class MainUndirectedGraphAdjMatrix {
    public static void main(String[] args) {
        UndirectedGraphAdjMatrix graph = new UndirectedGraphAdjMatrix(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 5);
        graph.addEdge(3, 4);

        graph.print();
    }
}

class UndirectedGraphAdjMatrix {
    private boolean[][] adjMatrix;
    private int nVertex;

    UndirectedGraphAdjMatrix(int nVertex) {
        adjMatrix = new boolean[nVertex][nVertex];
        this.nVertex = nVertex;
    }

    void addEdge(int sourceVertex, int destinationVertex) {
        adjMatrix[sourceVertex][destinationVertex] = true;
        adjMatrix[destinationVertex][sourceVertex] = true;
    }

    void print() {
        for (int i = 0; i < nVertex; i++) {
            ArrayList<Integer> destList = new ArrayList<>();
            for (int j = 0; j < adjMatrix[i].length; j++) {
                if (adjMatrix[i][j]) {
                    destList.add(j);
                }
            }

            if (!destList.isEmpty()) {
                System.out.println(i + " connected with: ");
                for (Integer integer : destList) {
                    System.out.print(integer + ", ");
                }
                System.out.println();
            }
        }
    }
}