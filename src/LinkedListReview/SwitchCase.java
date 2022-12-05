package LinkedListReview;

import java.util.LinkedList;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CustomLL<String> ll = new CustomLL<>();

        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String perintah = scan.nextLine();
            String[] splittedPerintah = perintah.split(" ");

            switch (splittedPerintah[0]) {
                case "TAMBAH":
                    if (splittedPerintah[2].equals("AWAL")) {
                        ll.add(splittedPerintah[1]);
                    } else {
                        ll.addLast(splittedPerintah[1]);
                    }
                    break;
                case "LIHAT":
                    System.out.println(ll.toString());
                    break;
                case "LEPAS":
                    if (splittedPerintah[1].equals("AWAL")) {
                        ll.removeFirst();
                    } else {
                        ll.removeLast();
                    }
                    break;
            }
        }
        scan.close();
    }
}

class CustomLL<T> extends LinkedList<T> {

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        T temp;
        
        try {
            temp = this.get(0);
        } catch (Exception e) {
            temp = null;
        }

        int index = 0;
        while (temp != null) {
            s.append(temp);
            try {
                temp = this.get(++index);
            } catch (Exception e) {
                temp = null;
            }
            if (temp != null) s.append("->");
        }
        return s.toString();
    }
    
}
