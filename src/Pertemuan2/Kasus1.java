package Pertemuan2;

import java.util.LinkedList;
import java.util.function.Predicate;

/**
 * Buat sebuah linkedlist yang menyimpan beberapa angka dan kemudian
 * menampilkan jumlah dari semua angka pada akhir.
 * 
 * 
 * ++++++
 * predicate: ganjil/genap
 */


public class Kasus1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        Predicate<Integer> filterGanjil = i -> (i % 2 != 0);
        Predicate<Integer> filterGenap = i -> (i % 2 == 0);

        ll.add(3);
        ll.add(3);
        ll.add(4);

        System.out.println(ll.toString());

        int jumlah = 0;

        // for (int i = 0; i < ll.size(); i++) {
        //     if (ll.get(i) % 2 == 0) {
                // bilangan genap
                
        //         jumlah += ll.get(i);
        //     } else {
                
        //         ll.remove(i);
        //     }
        // }

        ll.removeIf(filterGanjil);

        for (Integer x : ll) {
            jumlah += x;
        }

        System.out.println("Jumlah = " + jumlah);
    }
}
