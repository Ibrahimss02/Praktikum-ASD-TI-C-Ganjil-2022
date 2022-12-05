package Graph;

import java.util.LinkedList;
import java.util.Scanner;

public class MainUndirectedGraphList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nVertex = scan.nextInt();
        UndirectedGraphList undiGraph = new UndirectedGraphList(nVertex);

        for (int i = 0; i < nVertex; i++) {
            int source = scan.nextInt();
            int destination = scan.nextInt();

            undiGraph.addVertex(source, destination);
        }

        undiGraph.print();
    }
}

class UndirectedGraphList {
    LinkedList<Integer>[] connection;
    int vertex;

    UndirectedGraphList(int vertex) {
        connection = new LinkedList[vertex];
        this.vertex = vertex;

        for (int i = 0; i < connection.length; i++) {
            connection[i] = new LinkedList<>();
        }
    }

    void addVertex(int source,int destination){
        if (!connection[source].contains(destination)) {
            connection[source].add(destination);
        }
        if (!connection[destination].contains(source)) {
            connection[destination].add(source);
        }
    }

    void print() {
        for (int i = 0; i < vertex; i++) {
            if (!connection[i].isEmpty()) {
                System.out.println(i + " connected to");
                for (int j = 0; j < connection[i].size(); j++) {
                    System.out.println(" - " + connection[i].get(j));
                }
            }
        }
    }
}
