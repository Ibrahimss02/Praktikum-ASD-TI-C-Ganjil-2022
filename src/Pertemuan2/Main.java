package Pertemuan2;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kampung", 2, true, "Hitam");

        kucing.makan();
        kucing.melompat();
        kucing.printKucing();
    }
}

class Kucing {
    String jenis;
    int berat;
    boolean jenisKelamin;
    String warnaBulu;

    Kucing(String jenis, int berat, boolean jenisKelamin, String warnaBulu) {
        this.jenis = jenis;
        this.berat = berat;
        this.jenisKelamin = jenisKelamin;
        this.warnaBulu = warnaBulu;
    }

    void printKucing() {
        if (jenisKelamin) {
            System.out.printf("Kucing jenis %s berwarna %s dengan berat %d kg dan dengan jenis kelamin jantan", this.jenis, this.warnaBulu, this.berat);
        } else {
            System.out.printf("Kucing jenis %s berwarna %s dengan berat %d kg dan dengan jenis kelamin betina", this.jenis, this.warnaBulu, this.berat);
        }
        
    }

    void melompat() {
        System.out.println("Kucing melompat");
    }

    void makan() {
        System.out.println("Kucing makan");
    }
    
}