package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        String message = "I am the daemon thread!";
        while (true) {
            System.out.println(message);
            try {
                sleep(500L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
