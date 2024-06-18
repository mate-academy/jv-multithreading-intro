package core.basesyntax.condition;

import java.util.Arrays;

public class BoundedBufferExample {

    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer();

        // Create producer threads
        Thread producer1 = new Thread(new Producer(buffer, 1));
        Thread producer2 = new Thread(new Producer(buffer, 2));

        // Create consumer threads
        Thread consumer1 = new Thread(new Consumer(buffer, 1));
        Thread consumer2 = new Thread(new Consumer(buffer, 2));

        // Start the threads
        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }

    static class Producer implements Runnable {
        private final BoundedBuffer buffer;
        private final int producerId;

        public Producer(BoundedBuffer buffer, int producerId) {
            this.buffer = buffer;
            this.producerId = producerId;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 50; i++) {
                    buffer.put("Item " + i + " from Producer " + producerId);
                    System.out.println("Producer " + producerId + " put: Item " + i);
                    System.out.println("Producer " + Arrays.toString(buffer.getItems()));
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class Consumer implements Runnable {
        private final BoundedBuffer buffer;
        private final int consumerId;

        public Consumer(BoundedBuffer buffer, int consumerId) {
            this.buffer = buffer;
            this.consumerId = consumerId;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 50; i++) {
                    Object item = buffer.take();
                    System.out.println("Consumer " + consumerId + " took: " + item);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
