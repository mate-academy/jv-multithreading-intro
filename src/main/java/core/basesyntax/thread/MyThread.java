package core.basesyntax.thread;

public class MyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName()
                    + " .....  I am the daemon thread!");
        }
    }
}
