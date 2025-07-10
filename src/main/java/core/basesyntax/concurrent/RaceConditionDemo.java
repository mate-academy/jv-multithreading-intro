package core.basesyntax.concurrent;

import java.util.ArrayList;
import java.util.List;

public class RaceConditionDemo {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> sharedList = new ArrayList<>();

        // Thread A tries to add elements to the list
        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sharedList.add(i);
            }
        });

        // Thread B tries to add elements to the list
        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sharedList.add(i);
            }
        });

        threadA.start();
        threadB.start();

        // Wait for threads to finish
        threadA.join();
        threadB.join();

        System.out.println("Expected list size: 20000");
        System.out.println("Actual list size: " + sharedList.size());
    }
}
