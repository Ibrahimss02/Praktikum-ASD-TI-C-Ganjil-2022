package Graph;

import java.util.LinkedList;

public class MainDirectedGraphList {
    public static void main(String[] args) {
        DirectedGraphList graph = new DirectedGraphList(6);

        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 0);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);

        graph.print();
    }
}

class DirectedGraphList {
    private LinkedList<Integer>[] connection;
    private int nVertex;

    DirectedGraphList(int nVertex) {
        connection = new LinkedList[nVertex];
        this.nVertex = nVertex;

        for (int i = 0; i < connection.length; i++) {
            connection[i] = new LinkedList<>();
        }
    }

    void addEdge(int sourceVertex, int destinationVertex) {
        if (!connection[sourceVertex].contains(destinationVertex)) {
            connection[sourceVertex].add(destinationVertex);
        }
    }

    void print() {
        for (int i = 0; i < nVertex; i++) {
            if (!connection[i].isEmpty()) {
                System.out.println(i + " connected to");
                for (int j = 0; j < connection[i].size(); j++) {
                    System.out.print(connection[i].get(j) + ", ");
                }
                System.out.println();
            }
        }
    }
}