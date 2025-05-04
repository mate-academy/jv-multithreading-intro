package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private int counter = 0;

    @Override
    public void run() {
        while (counter != 20) {
            try {
                Thread.sleep(100L);
                System.out.println(counter);
                counter++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
