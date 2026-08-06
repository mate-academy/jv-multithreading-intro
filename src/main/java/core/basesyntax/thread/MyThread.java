package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Number thread: " + i);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException("Somethin went wrong...");
        }
    }
}
