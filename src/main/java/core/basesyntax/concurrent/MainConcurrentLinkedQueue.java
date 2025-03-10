package core.basesyntax.concurrent;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MainConcurrentLinkedQueue {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedDeque<String> queue = new ConcurrentLinkedDeque<>();
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                queue.offer("Newbie" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread consumer = new Thread(() -> {
            while (true) {
                String message = queue.poll();
                if (message != null) {
                    System.out.println("Consumed:" + message);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
