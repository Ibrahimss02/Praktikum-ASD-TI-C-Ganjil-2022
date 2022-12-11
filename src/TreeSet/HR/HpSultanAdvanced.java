package TreeSet.HR;

import java.util.Scanner;
import java.util.TreeSet;

// Do not edit this class
public class HpSultanAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<HandphoneAdvanced> handphones = new TreeSet<>();

        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String[] handphone = scan.nextLine().split(",");
            handphones.add(new HandphoneAdvanced(handphone[0], Integer.parseInt(handphone[1].trim()),
                    Float.parseFloat(handphone[2].trim()), Integer.parseInt(handphone[3].trim())));
        }

        System.out.println("List Handphone: ");
        for (HandphoneAdvanced handphone : handphones) {
            System.out.println(handphone);
        }

        scan.close();
    }
}

// Start here!!!
class HandphoneAdvanced implements Comparable<HandphoneAdvanced> {
    String nama;
    float rating;
    int harga;
    int publishedYear;

    public HandphoneAdvanced(String nama, int harga, float rating, int publishedYear) {
        this.nama = nama;
        this.harga = harga;
        this.rating = rating;
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return String.format("Nama: %s, Harga: %d, Rating: %.2f, Published Year: %d", this.nama, this.harga,
                this.rating, this.publishedYear);
    }

    @Override
    public int compareTo(HandphoneAdvanced handphone2) {
        int total = 0;

        if (this.harga > handphone2.harga)
            total -= 1;
        else
            total += 1;

        if (this.rating > handphone2.rating)
            total += 1;
        else
            total -= 1;

        if (this.publishedYear > handphone2.publishedYear)
            total += 1;
        else
            total -= 1;

        return total;
    }
}