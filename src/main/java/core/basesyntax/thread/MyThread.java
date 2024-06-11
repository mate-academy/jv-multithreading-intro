package core.basesyntax.thread;

public class MyThread extends Thread {
    public void run() {
        System.out.println("I am the daemon thread!");
    }
}
