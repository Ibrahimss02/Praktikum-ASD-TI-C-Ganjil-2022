package Pertemuan2;

import java.util.LinkedList;

/**
 * Perbedaan array & linkedlist
 * 
 * =============================
 * 1. Inisialisasi
 * 2. isEmpty = true/false 
 * 3. size = int
 * 4. penambahan = tambah node dibelakang
 * 5. Penghapusan = menghapus node
 * 6. Penyisipan = menyisipkan node 
 * 7. Pencarian = mencari node
 * 8. Pengaksesan = mengakses node
 * =============================
 */

public class SingleLinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        /**
         * Method isEmpty
         */
        if (ll.isEmpty()) {
            System.out.println("List kosong");
        } else {
            System.out.println("List tidak kosong");
        }

        /**
         * Method add
         */
        ll.add("Node pertama");

        if (ll.isEmpty()) {
            System.out.println("List kosong");
        } else {
            System.out.println("List tidak kosong");
        }

        /**
         * Method size
         */
        System.out.println("Ukuran list adalah : " + ll.size());

        ll.add("Node kedua");

        /**
         * Method toString
         */
        System.out.println(ll.toString());

        /**
         * Method remove
         */
        ll.remove(0);

        ll.add("Node ketiga");

        
        System.out.println(ll.toString());

        /**
         * Method add sisip
         */
        ll.add(1, "Node sisip");
        
        System.out.println(ll.toString());

        System.out.println("Pencarian : " + ll.contains("Node keempat"));
    
        System.out.println("Node indeks ke dua adalah : " + ll.get(2));

        System.out.println("Node indeks pertama adalah : " + ll.getFirst());
        
        System.out.println("Node terakhir adalah : " + ll.getLast());
    }
}
