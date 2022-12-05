package Stack;

import java.util.LinkedList;
import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(20);
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        // Cetak semua item dalam stack
        System.out.println(stack);

        Stack<String> stackString = new Stack<>();

        stackString.push("30");
        stackString.push("Kata");
        stackString.push("Contoh kalimat");
        System.out.println(stackString.pop());
        System.out.println(stackString.peek());

        // Cetak semua item dalam stack
        System.out.println(stackString);

        Stack<Handphone> sHandphones = new Stack<>();
        LinkedList<Handphone> lhandphone = new LinkedList<>();
        lhandphone.add(new Handphone("Samsung", 2_000_000));

        sHandphones.push(new Handphone("Samsung", 2_000_000));

        Handphone apple = new Handphone("Apple", 5_000_000);
        sHandphones.push(apple);
        System.out.println(sHandphones.pop());

        System.out.println(sHandphones.toString());
    }
}

class Handphone {
    String merk;
    int harga;

    Handphone(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Merk " + merk + " dengan " + "Harga: " + harga;
    }
}