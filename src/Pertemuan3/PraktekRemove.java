package Pertemuan3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Predicate;


/**
 * Praktek menggunakan method remove dari linkedlist dan
 * penggunaan switch case untuk mengatur alur program
 *
 * 1. Remove objek tertentu
 * 2. Remove kumpulan objek
 * 3. Remove berdasarkan kriteria tertentu (Predicate)
 * 4. Remove item pertama & terakhir
 * 5. Remove duplikat item pertama & terakhir
 * 6. Remove ALL
 *
 * 7. Switch Case perintah
 */
public class PraktekRemove {
    public static void main(String[] args) {
        ListKata list = new ListKata();

        list.tambah(1);
        list.tambah(3);
        list.tambah(2);
        list.tambah(3);
        list.tambah(4);
        list.tambah(3);
        list.tambah(5);

        System.out.println(list.ll.toString());
        list.hapusDuplikatTerakhir(3);

        System.out.println(list.ll.toString());
        list.clearAll();
        System.out.println(list.ll.toString());
    }
}

class ListKata {
    LinkedList<Integer> ll = new LinkedList<>();

    void tambah(int item) {
        ll.add(item);
    }

    void sisip(int index, int item) {
        ll.add(index, item);
    }

    void hapusIndex(int hapus) {
        ll.remove(hapus);
    }

    /**
     * list = {1, 2, 3, 4, 5}
     * list2 = {1, 2}
     */
    void hapusList() {
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);

        // for (Integer x: list2) {
        //     ll.removeIf(i -> i == x);
        // }

        ll.removeAll(list2);
    }

    void hapusGanjil() {
        Predicate<Integer> filterGanjil = i -> (i % 2 != 0);

        ll.removeIf(filterGanjil);
    }

    void hapusPertama() {
        ll.removeFirst();
    }

    void hapusTerakhir() {
        ll.removeLast();
    }

    /**
     * list = {1, 2, 3, 3, 3, 4, 5}
     */
    void hapusDuplikatPertama(int number) {
        ll.removeFirstOccurrence(number);
    }

    void hapusDuplikatTerakhir(int number) {
        ll.removeLastOccurrence(number);
    }

    void clearAll() {
        ll.clear();
    }

}