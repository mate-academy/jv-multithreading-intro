package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon thread");
        }
    }
}
