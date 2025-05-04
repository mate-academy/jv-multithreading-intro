package core.basesyntax.thread;

public class MyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
        }
    }
}
