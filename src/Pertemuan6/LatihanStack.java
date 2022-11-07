package Pertemuan6;

import java.util.Scanner;
import java.util.Stack;

public class LatihanStack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.nextLine();
        int counter = 0;

        for (int i = 0; i < n; i++) {
            char x = scan.nextLine().charAt(0);
            
            if (stack.isEmpty()) {
                stack.push(x);
                continue;
            }

            if (x == '\\') {
                char temp = stack.peek();
                
                // System.out.println("Input: " + x);
                // System.out.println("Paling atas : " + temp);
                if (temp == '/') {
                    stack.pop();
                    counter += 2;
                    // System.out.println("Popped");
                }
            } else {
                stack.push(x);
            }

            // System.out.println("Latest : " + stack.toString());
        }

        System.out.println(stack.toString());
        System.out.println(counter);

        scan.close();
    }
}