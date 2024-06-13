package core.basesyntax.interrupt;

public class Task implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100_000_000; i++) {
            processDataChunk(i);

            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Data processing was interrupted");
                break;
            }
        }
    }

    private void processDataChunk(int i) {
        System.out.println("Process chunk: " + i);
    }
}
