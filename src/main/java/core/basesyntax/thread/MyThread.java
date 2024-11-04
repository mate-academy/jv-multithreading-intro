package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void start() {
        while (true) {
            System.out.println("I am the daemon thread!");
        }
    }
}
