package core.basesyntax.thread;

public class MyThread extends Thread {
    public MyThread() {
        setDaemon(true);

    }

    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
        }
    }
}
