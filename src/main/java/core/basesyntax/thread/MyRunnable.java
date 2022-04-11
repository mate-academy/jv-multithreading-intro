package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        String string = "I am the daemon thread!";
        while (true) {
            System.out.println(string);
        }
    }
}
