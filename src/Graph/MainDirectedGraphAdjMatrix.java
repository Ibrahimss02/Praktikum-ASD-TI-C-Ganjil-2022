package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainDirectedGraphAdjMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nEdge = scan.nextInt();
        DirectedGraphAdjMatrix dGraph = new DirectedGraphAdjMatrix(10);


        for (int i = 0; i < nEdge; i++) {
            int source = scan.nextInt();
            int destination = scan.nextInt();
            dGraph.addEdge(source, destination);
        }

        dGraph.print();
        
        scan.close();
    }
}

class DirectedGraphAdjMatrix {
    private boolean[][] adjMatrix;
    private int nVertex;

    DirectedGraphAdjMatrix(int nVertex) {
        this.nVertex = nVertex;
        adjMatrix = new boolean[nVertex][nVertex];
    }

    void addEdge(int source, int destination) {
        adjMatrix[source][destination] = true;
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