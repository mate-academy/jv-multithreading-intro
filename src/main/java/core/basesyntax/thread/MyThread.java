package core.basesyntax.thread;

public class MyThread extends Thread {
    boolean print = true;

    public void run() {
        while (print) {
            System.out.println("I am the daemon thread!");
        }
    }
}
