package SingleLinkedList;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * List menyimpan string (tidak boleh ada duplikat)
 * 
 * fungsi method contains
 */

public class Kasus2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedList<String> listKata = new LinkedList<>();

        int n = scan.nextInt();

        for (int i = 0; i <= n; i++) {
            String kata = scan.nextLine();

            if(!listKata.contains(kata)) {
                listKata.add(kata);
            } 
        }

        System.out.println(listKata.toString());
        scan.close();
    }
}
