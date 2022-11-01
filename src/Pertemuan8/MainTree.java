package Pertemuan8;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node kiri;
    Node kanan;

    Node(int data){
        this.data = data;
    }
}

class Tree {
    Node root;

    boolean isEmpty() {
        return root == null;
    }

    void insert(int newData) {
        Node newNode = new Node(newData);

        if (isEmpty()) {
            root = newNode;
        } else {
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()) {
                Node temp = q.poll();

                if (temp.kiri == null) {
                    temp.kiri = newNode;
                    break;
                } else {
                    q.add(temp.kiri);
                }
                if (temp.kanan == null) {
                    temp.kanan = newNode;
                    break;
                } else {
                    q.add(temp.kanan);
                }
            }
        }
    }

    void preorderTraversal(Node temp) {
        if (temp == null) return;
        System.out.print(temp.data + ", ");
        preorderTraversal(temp.kiri);
        preorderTraversal(temp.kanan);
    }

    void inorderTraversal(Node temp) {
        if (temp == null) return;
        inorderTraversal(temp.kiri);
        System.out.print(temp.data + ", ");
        inorderTraversal(temp.kanan);
    }

    void postorderTraversal(Node temp) {
        if (temp == null) return;
        postorderTraversal(temp.kiri);
        postorderTraversal(temp.kanan);
        System.out.print(temp.data + ", ");
    }
}

public class MainTree {
    public static void main(String[] args) {
        Tree tree = new Tree();

        System.out.println(tree.isEmpty());

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        System.out.println("Preorder -> ");
        tree.preorderTraversal(tree.root);
        System.out.println("\nInorder -> ");
        tree.inorderTraversal(tree.root);
        System.out.println("\nPostorder -> ");
        tree.postorderTraversal(tree.root);
    }
}
