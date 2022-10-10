package Pertemuan4;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomLL<Character> ll = new CustomLL<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String[] cmd = scan.nextLine().split(" ");

            switch(cmd[0]) {
                case "TAMBAH": {
                    if (cmd[2].equals("AWAL")) {
                        ll.addFirst(cmd[1].charAt(0));
                    } else {
                        ll.addLast(cmd[1].charAt(0));
                    }
                    break;
                }
                case "LIHAT": {
                    if(ll.isEmpty()) {
                        System.out.println("<");
                    } else {
                        System.out.print("<-" + ll.toString());
                        System.out.println();
                    }
                    break;
                }
                case "LEPAS": {
                    if(!ll.isEmpty()) {
                        if(cmd[1].equals("AWAL")) {
                            ll.removeFirst();
                        } else {
                            ll.removeLast();
                        }
                    break;
                    }
                }
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
            if (temp != null) s.append("-");
        }
        return s.toString();
    }
}