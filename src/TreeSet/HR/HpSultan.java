package TreeSet.HR;

import java.util.Scanner;
import java.util.TreeSet;

public class HpSultan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<Handphone> handphones = new TreeSet<>();

        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String[] handphone = scan.nextLine().split(",");
            handphones.add(new Handphone(handphone[0], Integer.parseInt(handphone[1].trim())));
        }

        System.out.println("List Handphone: ");
        for (Handphone handphone : handphones) {
            System.out.println(handphone);
        }

        scan.close();
    }
}

class Handphone implements Comparable<Handphone> {
    String nama;
    int harga;    

    public Handphone(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return String.format("Nama: %s, Harga: %d", this.nama, this.harga);
    }

    @Override
    public int compareTo(Handphone handphone2) {
        if (harga > handphone2.harga) return 1;
        else if (harga < handphone2.harga) return -1;
        return 0;
    }
}
