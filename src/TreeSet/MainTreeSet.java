package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        TreeSet<Pelanggan> treeSetPelanggan = new TreeSet<>();

        Pelanggan pelanggan1 = new Pelanggan("Glen", 3);
        Pelanggan pelanggan2 = new Pelanggan("John", 1);
        Pelanggan pelanggan3 = new Pelanggan("Budi", 7);
        Pelanggan pelanggan4 = new Pelanggan("Tono", 10);
        Pelanggan pelanggan5 = new Pelanggan("Febri", 2);
        Pelanggan pelanggan6 = new Pelanggan("Anita", 32);

        // Add
        treeSetPelanggan.add(pelanggan1);
        treeSetPelanggan.add(pelanggan2);
        treeSetPelanggan.add(pelanggan3);

        System.out.println("TreeSet Pelanggan: " + treeSetPelanggan);

        TreeSet<Pelanggan> treeSetPelanggan2 = new TreeSet<>();

        treeSetPelanggan2.add(pelanggan4);
        treeSetPelanggan2.add(pelanggan5);
        treeSetPelanggan2.add(pelanggan6);

        System.out.println("TreeSet Pelanggan 2: " + treeSetPelanggan2);

        // AddAll
        TreeSet<Pelanggan> treeSetPelanggan3 = new TreeSet<>();

        treeSetPelanggan3.addAll(treeSetPelanggan);
        treeSetPelanggan3.addAll(treeSetPelanggan2);

        System.out.println("TreeSet Pelanggan 3: " + treeSetPelanggan3);
    
        // Iterate (access tree set element)
        Iterator<Pelanggan> iterator = treeSetPelanggan3.iterator();

        while (iterator.hasNext()) {
            System.out.print("Nama Pelanggan: " + iterator.next());
            System.out.println(" -> ");
        }

        // Remove
        boolean removePelanggan3 = treeSetPelanggan3.remove(pelanggan3);

        System.out.println("is pelanggan3 removed? = " + removePelanggan3);
        
        System.out.println("TreeSet Pelanggan 3: " + treeSetPelanggan3);
    }
}

class Pelanggan implements Comparable<Pelanggan>{

    String nama;
    int totalBarangBelanja = 0;

    Pelanggan(String nama, int totalBarangBelanja) {
        this.nama = nama;
        this.totalBarangBelanja = totalBarangBelanja;
    }

    @Override
    public int compareTo(Pelanggan pelanggan2) {
        if (this.totalBarangBelanja > pelanggan2.totalBarangBelanja) {
            return -1;
        } else if (this.totalBarangBelanja < pelanggan2.totalBarangBelanja) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s(%d)", this.nama, this.totalBarangBelanja);
    }
}