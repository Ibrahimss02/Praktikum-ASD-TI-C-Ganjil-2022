package BinarySearchTree;

class NodeManusia {
    String nama;
    int umur;
    NodeManusia kiri, kanan;

    NodeManusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
}

class BST {
    NodeManusia root;

    boolean isEmpty() {
        return root == null;
    }

    void insert(String newManusiaNama, int newManusiaUmur) {
        NodeManusia newNode = new NodeManusia(newManusiaNama, newManusiaUmur);

        if (isEmpty()) {
            root = newNode;
        } else {
            NodeManusia temp = root;

            while (true) {
                if (newManusiaUmur > temp.umur) {
                    if (temp.kanan == null) {
                        temp.kanan = newNode;
                        break;
                    }
                    temp = temp.kanan;
                    continue;
                } else if (newManusiaUmur < temp.umur) {
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

    void preorderTraversal(NodeManusia temp) {
        if (temp == null) return;
        System.out.print("Nama " + temp.nama + " dengan umur " + temp.umur + ", ");
        preorderTraversal(temp.kiri);
        preorderTraversal(temp.kanan);
    }

    void inorderTraversal(NodeManusia temp) {
        if (temp == null) return;
        inorderTraversal(temp.kiri);
        System.out.print("Nama " + temp.nama + "dengan umur " + temp.umur + ", ");
        inorderTraversal(temp.kanan);
    }

    void postorderTraversal(NodeManusia temp) {
        if (temp == null) return;
        postorderTraversal(temp.kiri);
        postorderTraversal(temp.kanan);
        System.out.print("Nama " + temp.nama + " dengan umur " + temp.umur + ", ");
    }
}

public class MainBSTManusia {
    public static void main(String[] args) {
        BST treeBst = new BST();
        
        // Check tree
        System.out.println(treeBst.isEmpty());

        treeBst.insert("Budi", 8);
        treeBst.insert("Glen", 3);
        treeBst.insert("John", 10);
        treeBst.insert("Fred", 1);
        treeBst.insert("contoh nama",2);
        treeBst.insert("contoh nama kedua", 9);

        treeBst.preorderTraversal(treeBst.root);
        System.out.println();
        treeBst.inorderTraversal(treeBst.root);
        System.out.println();
        treeBst.postorderTraversal(treeBst.root);
    }
}
