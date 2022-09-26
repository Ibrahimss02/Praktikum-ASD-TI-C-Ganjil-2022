package Pertemuan3;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Buat sebuah list dengan fitur filter untuk menghilangkan bilangan tertentu
 * 
 * 
 * List = {1, 2, 3, 4, 5}
 * input = 3
 * 
 * 
 * Perintah:
 * 1. tambah 3
 * 2. hapus 2
 * 3. sisip 1 3
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ListKereta list = new ListKereta();

        for (int i = 0; i <= n; i++) {

            String perintah = scan.nextLine();
            String[] splittedPerintah = perintah.split(" ");

            switch (splittedPerintah[0]) {
                case "tambah":
                    list.tambahItem(Integer.parseInt(splittedPerintah[1]));
                    break;
                case "hapus":
                    list.hapus(Integer.parseInt(splittedPerintah[1]));
                    break;
                case "sisip":
                    list.sisip(Integer.parseInt(splittedPerintah[1]), Integer.parseInt(splittedPerintah[2]));
                    break;
            }
        }

        System.out.println(list.ll.toString());
    }
}

class ListKereta {
    LinkedList<Integer> ll = new LinkedList<>();

    void tambahItem(int angka) {
        ll.add(angka);
    }

    void hapus(int index) {
        ll.remove(index);
    }

    void sisip(int index, int angka) {
        ll.add(index, angka);
    }
}