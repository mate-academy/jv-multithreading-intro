package core.basesyntax.thread;

public class MyThread extends Thread {
    private static ThreadLocal<Integer> number = new ThreadLocal<>();

    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
