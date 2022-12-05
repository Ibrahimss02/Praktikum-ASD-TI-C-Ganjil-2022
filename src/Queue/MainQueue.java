package Queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Enqueue item
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        // Print queue
        System.out.println(q);

        int x = q.peek();
        System.out.println(x);
        System.out.println(q);
        x = q.remove();
        System.out.println(x);
        System.out.println(q);

        System.out.println("=====================");

        Queue<Human> qHumans = new LinkedList<>();

        Human human1 = new Human("Glen", 23);
        Human human2 = new Human("Pedro", 19);

        qHumans.add(human1);
        qHumans.add(human2);
        qHumans.add(new Human("Orang baru", 23));

        System.out.println(qHumans);

        qHumans.remove();

        System.out.println(qHumans);

        System.out.println("=====================");

        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();
        
        namePriorityQueue.add("Glen");
        namePriorityQueue.add("Pedro");
        namePriorityQueue.add("Budi");
        
        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
        }

        System.out.println("=====================");


        Comparator<Human> humanComparator = new Comparator<Human>() {

            @Override
            public int compare(Human human1, Human human2) {
                
                if (human1.umur > human2.umur) {
                    return -1;
                } else if (human1.umur < human2.umur) {
                    return 1;
                }
                return 0;
            }
            
        };

        PriorityQueue<Human> humanPriorityQueue = new PriorityQueue<>(humanComparator);

        humanPriorityQueue.add(human1);
        humanPriorityQueue.add(human2);
        humanPriorityQueue.add(new Human("Orang baru", 23));
        humanPriorityQueue.add(new Human("Orang baru 2", 64));

        while (!humanPriorityQueue.isEmpty()) {
            System.out.println(humanPriorityQueue.remove());
        }
        System.out.println("=====================");

        Queue<Character> priorityQueue = new PriorityQueue<Character>();

        priorityQueue.add('D');
        priorityQueue.add('C');
        priorityQueue.add('A');
        priorityQueue.add('E');
        priorityQueue.add('T');


        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }

    }
}

class Human {
    String name;
    int umur;

    Human(String name, int umur) {
        this.name = name;
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Nama: " + name + ", Umur: " + umur;
    }
}