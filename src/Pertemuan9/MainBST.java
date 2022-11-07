package Pertemuan9;

class Node {
    int data;
    Node kiri, kanan;

    Node(int data) {
        this.data = data;
    }
}

class BST {
    Node root;

    boolean isEmpty() {
        return root == null;
    }

    void insert(int newData) {
        Node newNode = new Node(newData);

        if (isEmpty()) {
            root = newNode;
        } else {
            Node temp = root;

            while (true) {
                if (newData > temp.data) {
                    if (temp.kanan == null) {
                        temp.kanan = newNode;
                        break;
                    }
                    temp = temp.kanan;
                    continue;
                } else if (newData < temp.data) {
                    if (temp.kiri == null) {
                        temp.kiri = newNode;
                        break;
                    }
                    temp = temp.kiri;
                    continue;
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

public class MainBST {
    public static void main(String[] args) {
        BST treeBst = new BST();
        
        // Check tree
        System.out.println(treeBst.isEmpty());

        treeBst.insert(8);
        treeBst.insert(3);
        treeBst.insert(10);
        treeBst.insert(1);
        treeBst.insert(2);
        treeBst.insert(9);

        treeBst.preorderTraversal(treeBst.root);
        System.out.println();
        treeBst.inorderTraversal(treeBst.root);
        System.out.println();
        treeBst.postorderTraversal(treeBst.root);
    }
}

