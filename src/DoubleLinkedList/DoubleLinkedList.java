package DoubleLinkedList;

import java.util.LinkedList;

public class DoubleLinkedList {
    public static void main(String[] args) {
        LinkedList<LinkedList<String>> ll = new LinkedList<>();

        LinkedList<String> ll1 = new LinkedList<>();
        LinkedList<String> ll2 = new LinkedList<>();
        LinkedList<String> ll3 = new LinkedList<>();
        

        ll1.add("Glen");
        ll1.add("John");
        ll1.add("Bert");


        ll2.add("Contoh");
        ll2.add("Kalimat");

        ll3.add("LinkedList 2D");

        ll.add(ll1);
        ll.add(ll2);
        ll.add(ll3);

        for (LinkedList<String> x : ll) {
            System.out.println(x.toString());
        }

        ll1.add("Item Baru");

        for (LinkedList<String> x : ll) {
            System.out.println(x.toString());
        }
    }
}