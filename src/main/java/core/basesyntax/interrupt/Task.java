package core.basesyntax.interrupt;

public class Task implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            processDataChunk(i);

            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Data processing was interrupted");
                break;
            }
        }
    }

    private void processDataChunk(int i) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Interrupted exception !!!" + Thread.currentThread().isInterrupted());
            System.out.println(Thread.interrupted());
            System.out.println(Thread.interrupted());
            return;
        }
        System.out.println("Process chunk: " + i);
    }
}
